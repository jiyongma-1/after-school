package collection.deque.exam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }

        answer = stack.getFirst();
        return answer;
    }

}
/*
후위식 연산
- 후위식 연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하시오.
- 만약 3*(5+2)-9 을 후위식 연산으로 표현하면 352+*9- 로 표현되면 결과는 12이다.

- 문자열 -> 문자(숫자타입, 아스키코드값)

입력 예제
352+*9-

출력 예제
12
 */