package collection.array.exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(n, arr)) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i=1; i<n; i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}
/*
큰 수 출력하기

N(1<=N<=100)개의 정수를 입력 받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번쨰 수는 무조건 출력한다.)

입력예제
6
7 3 9 5 6 12

출력예제
7 9 6 12
 */