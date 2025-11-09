package collection.link.exam;

import java.util.LinkedList;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> input = new LinkedList<>();

       int n = sc.nextInt();
       for (int i=0; i<n; i++) {
           input.add(sc.next());
       }

       LinkedList<String> result = new LinkedList<>();

       for (int i=0; i< input.size(); i++) {
           String val = input.get(i);
           if (i % 2 == 0) {
//               result.add(0, val);
               result.addFirst(val);
           } else {
//               result.add(val);
               result.addLast(val);
           }
       }

        System.out.println(result);
    }
}
/*
연결 리스트 내 값들을 앞뒤로 대칭 정렬
- 문자열 리스트가 주어졌을 때, 이를 앞에서부터 하나씩 꺼내 양쪽 끝에 번갈아가며 추가하여 대칭 구조로 만드시오.
  즉,
  첫번째값 -> 앞에 추가
  두번쨰값 -> 뒤에 추가
  세번째값 -> 앞에 추가
  네번째값 -> 뒤에 추가
  ... 반복

입력 예시
5
A B C D E

출력 예시
[E, C, A, B, D]
 */
