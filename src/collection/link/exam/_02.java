package collection.link.exam;

import java.util.LinkedList;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            list.add(sc.next());
        }

        LinkedList<String> reversed = new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        System.out.println(reversed);
    }
}
/*
값 뒤집기
- 입력할 문자열의 갯수와 문자열들을 입력한 후 해당 문자열을 역순으로 출력하시오.

입력 예시
4
one two three four

출력 예시
[four, three, two, one]
 */
