package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}
/*
스택
- 후입선출(LIFO)
- 전통적으로 스택에 값을 넣는 것을 push 라하고, 스택에서 값을 빼는 것을 pop 이라 한다.
- 자바에서 Stack 클래스는 가급적 사용하지 않아야 한다.
  자바의 Stack은 클래스 내부에서 Vector 구조를 사용한다. -> 자바 1.0에 개발됐는데, 지금은 사용하지 않는 구조이다.
  -> 하위 호환을 남겨났을 뿐이다. -> 지금은 더 빠르고 좋은 자료구조가 많기 때문에 Stack을 사용하는 것을 권장하지 않는다.
  -> 대신 Deque를 사용한다.
 */
