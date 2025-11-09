package collection.deque.exam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for (char ch : stack) {
            answer.insert(0, ch);
        }

        return answer.toString();
    }
}
/*
괄호문자 제거
- 입력된 문자열에서 소괄호() 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하시오.

입력 예제
(A(BC)D)EF(G(H)(IJ)K)LM(N)

출력 예제
EFLM
 */
