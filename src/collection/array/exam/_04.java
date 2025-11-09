package collection.array.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int tmp = arr[i];  // 현재 수
            int res = 0;  // 뒤집힌 수 저장할 변수

            // 정수 뒤집기 320, 일의 자리만 검사
            while (tmp > 0) {
                int t = tmp % 10;  // 일의 자리 추출
                res = res * 10 + t;  // 기존 결과에 자릿수를 올려서 붙이기
                tmp = tmp / 10;  // 다음 자릿수로 이동
            }

            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
/*
뒤집은 소수

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하시오.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다.
단 910을 뒤집으면 19로 숫자화해야 한다. 첫 자리부터의 연속된 0은 무시한다.

9
32 55 62 20 250 370 200 30 100

23 2 73 2 3
 */
