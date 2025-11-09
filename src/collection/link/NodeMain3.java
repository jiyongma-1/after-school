package collection.link;

/*
    몇 가리 기능 추가
    1. 모든 노드 탐색하기
    2. 마지막 노드 조회하기
    3. 특정 index의 노드 조회하기
    4. 노드의 데이터 추가하기
 */
public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 1. 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 2. 마지막 노드 탐색하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 3. 특정 index의 노드 조회하기
        int index = 1;
        Node index1Node = getNode(first, index);
        System.out.println("index1Node = " + index1Node.item);

        // 4. 데이터 추가하기
        System.out.println("데이터 추가");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, Object param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);

    }
}
/*
    노드는 내부에 데이터와 다음 노드에 대한 참조를 가지고 있다.
    지금까지 설명한 구조는 각각의 노드가 참조를 통해 연결(LINK) 되어 있다.
    데이터를 추가할 때 동적으로 필요한 만큼의 노드만 만들어서 연결하면 된다. 따라서 배열과 다르게 메모리를 낭비하지 않는다.
      -> 물론 next 필드를 통해 참조값을 보관해야 하기 때문에 배열과 비교해서 추가적인 메모리 낭비가 발생한다.
    이렇게 각각의 노드를 연결해서 사용하는 자료 구조로 리스트를 만들 수 있는데, 이것을 연결 리스트(Linked List)라 한다.
 */