package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // 노드의 연결 상태를 더 편하게 보기 위해 toString()을 오버라이딩 해보자.


//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }

}

