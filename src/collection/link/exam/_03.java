package collection.link.exam;

import java.util.LinkedList;

public class _03 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("red");
        list1.add("green");
        list1.add("blue");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("yellow");
        list2.add("orange");

//        for (int i=0; i<list2.size(); i++) {
//            list1.add(list2.get(i));
//        }

        list1.addAll(list2);

        for (String color : list1) {
            System.out.print(color + " ");
        }


    }
}
/*
두 개의 연결 리스트 병합
두 개의 문자열 리스트가 있다. 이 두 리스트를 하나의 리스트로 이어붙인 후, 모든 값을 한 줄에 출력하시오.

입력 자료
list1: red, green, blue
list2: yellow, orange

출력 예시
red green blue yellow orange
 */
