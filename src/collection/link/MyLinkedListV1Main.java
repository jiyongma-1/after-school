package collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("== 기능 사용 ==");
        System.out.println("list.size(): " + list.size());
        System.out.println("list.get(1): " + list.get(1));
        System.out.println("list.indexOf('c'): " + list.indexOf("c"));
        System.out.println("list.set(2, 'z'): " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("== 범위 초과 ==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
        // 연결 리스트는 데이터를 추가할 때 마다 동적으로 노드가 늘어나기 때문에 범위를 초과하는 문제를 발생하지 않는다.
    }
}
/*
1. Object get(int index)
- 특정 위치에 있는 데이터를 반환한다.
- O(n)
  -> 배열은 인덱스로 원하는 데이터를 즉시 찾을 수 있었다. 따라서 배열을 사용하는 배열 리스트도 인덱스로 조회시
     O(1)의 빠른 성능을 보장한다. 하지만 연결 리스트에서 사용하는 노드들은 배열이 아니다.
     단지 다음 노드에 대한 참조가 있을 뿐이다. 따라서 인덱스로 원하는 위치의 데이터를 찾으려면 인덱스 숫자만큼
     다음 노드를 반복해서 찾아야 한다. 따라서 인덱스 조회 성능이 나쁘다.
2. void add(Object e)
- 마지막에 데이터를 추가한다.
- O(n)
3. Object set(int index, Object e)
- 특정 위치에 있는 데이터를 찾아서 변경한다. 그리고 기존 값을 반환한다.
- O(n)
4. int indexOf(Object e)
- 데이터를 검색하고, 검색된 위치를 반환한다.
- O(n)
 */