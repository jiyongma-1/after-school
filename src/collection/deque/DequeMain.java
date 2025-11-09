package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque1 = new LinkedList<>();

        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println(deque);
    }
}
/*
Deque (데크, 덱)
- Double Ended Queue 의 약자
- 양쪽 끝에서 요소를 추가하거나 제거할 수 있다.
- 큐와 스택의 기능을 모두 포함하고 있어, 매우 유연한 자료구조이다.

- offerFirst() : 앞에 추가
- offerLast() : 뒤에 추가
- pollFirst() : 앞에서 꺼냄
- pollLast() : 뒤에서 꺼냄
 */