package collection.array.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        // 결과 문자열로 받아서 문자로 바꾸어 한 줄씩 출력
        for (char x : solution(a, b).toCharArray()) {
            System.out.println(x);
        }
    }

    private static String solution(int[] a, int[] b) {
        String answer = "";
        for (int i=0; i<a.length; i++) {
            if (a[i]==b[i]) {
                answer+="D";
            } else if (a[i]==1 && b[i]==3) {
                answer+="A";
            } else if (a[i]==2 && b[i]==1) {
                answer+="A";
            } else if (a[i]==3 && b[i]==2) {
                answer+="A";
            }
            else {
                answer+="B";
            }

        }

        return answer;
    }
}
/*
가위 바위 보
A, B 두 사람이 가위 바위 보 게임을 한다.
총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력한다. 비길 경우에는 D를 출력한다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정한다.

두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

5
2 3 3 1 3
1 1 2 2 3

A
B
A
B
D
 */