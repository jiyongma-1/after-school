package collection.deque.exam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a, b));
    }

    private static String solution(String need, String plan) {
        String answer = "YES";
        Deque<Character> queue = new ArrayDeque<>();

        for (char x : need.toCharArray()) {
            queue.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) return "NO";

        return answer;
    }
}
/*
현수는 1년 과정의 수업계획을 짜야합니다.
수업 중에는 필수과목이 있습니다. 이 필수과목은 반드시 이수해야 하며, 그 순서도 정해져 있습니다.
만약 총 과목이 A, B, C, D, E, F, G가 있고, 여기서 필수과목이 CBA로 주어지면 필수과목은 C, B, A 과목이며
이 순서대로 꼭 수업계획을 짜야합니다.
여기서 순서란 B 과목은 C 과목을 이수한 후 들어야 하고, A 과목은 C, B를 이수한 후에 들어야 한다는 것입니다.
현수가 C, B, D, A, G E로 수업 계획을 짜면 제대로 된 설계이지만 C, G, E, A, D, B 순으로 짰다면 잘못 설계된
수업입니다.
수업계획은 그 순서대로 앞에 수업이 이수되면 다음 수업을 시작한다는 것으로 해석합니다.
수업계획서상의 각 과목은 무조건 이수된다고 가정합니다.
필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 "YES", 잘못된 것이면 "NO"를 출력하는
프로그램을 작성하시오.

입력 예제
CBA
CBDAGE

BCDAGE -> NO
CBDKGE -> NO

출력 예제
YES
 */
