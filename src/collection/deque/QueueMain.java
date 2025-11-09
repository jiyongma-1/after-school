package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
         Queue<Integer> queue = new ArrayDeque<>();
//         Queue<Integer> queue1 = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }
}
/*
큐
- 선입선출(FIFO)
- 전통적으로 큐에 값을 넣는 것을 offer 라 하고, 큐에서 값을 빼는 것을 poll 이라 한다.
- Collection interface <- Queue interface <- Deque interface
- Deque interface를 구현한 구현체는 2개가 있다.
- ArrayDeque, LinkedList
 */
