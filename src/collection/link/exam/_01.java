package collection.link.exam;

import java.util.Scanner;
import java.util.LinkedList;

public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        int max = list.getFirst();
        int index = 0;
        for (int i=1; i<list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }

        System.out.println("최대값: " + max + ", 인덱스: " + index);
    }
}
/*
1. 연결 리스트에서 최대값과 인덱스 찾기
정수의 갯수와 정수들을 입력 받은 후 그 중 가장 큰 값과 그 인덱스를 출력하시오.

입력 예제
5
5 17 9 24 12

출력 예제
최대값: 24, 인덱스: 3
 */
