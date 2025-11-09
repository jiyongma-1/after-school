package collection.array.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }
}
/*
보이는 학생
선생님이 N명의 학생을 일렬로 세웠다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
맨 앞에 서있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하시오.
(어떤 학생이 자기 앞에 서있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않는다.)

8
130 135 148 140 145 150 150 153

5
 */
