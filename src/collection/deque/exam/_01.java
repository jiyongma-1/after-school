package collection.deque.exam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }

    private static String solution(String str) {
        String answer = "YES";
        Deque<Character> stack = new ArrayDeque<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";

        return answer;
    }
}
/*
올바른 괄호
- 괄호가 입력되면 올바른 괄호이면 "YES", 올바르지 않으면 "NO"를 출력한다.
- (())() 이것은 괄호의 쌍이 올바르게 위치한 올바른 괄호, (()())) 은 올바른 괄호가 아니다.

입력 예시1
(()(()))(()

입력 예시2
(())()

출력 예시1
NO

출력 예시2
YES
 */
