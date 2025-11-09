package collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    // 요소를 리스트의 마지막에 추가
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    // 특정 인덱스에 요소 삽입
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    // 지정된 인덱스의 요소를 새 값으로 바꾸고 이전 값을 반환
    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    // 지정된 인덱스에 위치한 요소를 반환
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    // 지정된 인덱스에 위치한 요소를 삭제하고 반환
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;

        size--;
        return removedItem;
    }

    // 특정 요소의 인덱스를 반환, 없으면 -1 반환
    public int indexOf(E e) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // 리스트에 저장된 요소 개수 반환
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV3{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    // 내부 클래스: 리스트의 각 노드를 표현
    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if (temp.next != null) {
                    sb.append("->");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
/*
중첩 클래스
class OuterClass {
    ...
    static class StaticNestedClass {
        ...
    }
}
- 이렇게 클래스 안에서 클래스를 선언하는 것을 중첩 클래스라 한다.
- 중첩 클래스는 특정 클래스 안에서만 사용될 때 주로 사용한다.
- Node 클래스는 MyLinkedList 안에서만 사용된다. 외부에서는 사용할 이유가 없다.
- 이럴때 중첩 클래스를 사용하면 특정 클래스 선언을 숨길 수 있다.
- 중첩 클래스를 사용하면 MyLinkedListV3 입장에서 외부에 있는 Node 클래스보다
  내부에 선언한 Node 클래스를 먼저 사용한다.
 */
