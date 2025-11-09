package collection.array;

//배열과 같이 여러 데이터(자료)를 구조화해서 다루는 것을 자료구조라 한다.
//자바는 배열 뿐만 아니라, 컬렉션 프레임워크라는 이름으로 다양한 자료 구조를 제공한다.
//컬렉션 프레임워크와 자료 구조를 설명하기 전에 먼저 자료 구조의 가장 기본이 되는 배열의 특징을 알아보자.

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("===== index 입력 =====");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        // 배열에서 인덱스를 사용하면 매우 빠르게 자료를 접근할 수 있다.
        // 인덱스를 통한 입력, 변경, 조회의 경우 한 번의 계산으로 자료의 위치를 찾을 수 있다.
        // O(1)

        System.out.println("===== index 변경 =====");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
        // O(1)

        System.out.println("===== index 조회 =====");
        System.out.println("arr[2] = " + arr[2]);
        // O(1)

        // 배열 검색
        System.out.println("===== 배열 검색 =====");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr["+i+"]: " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
        // O(n)
    }
}
/*
배열 정리
- 배열의 인덱스 사용 : O(1)
- 배열의 순차 검색 : O(n)
- 배열의 데이터가 100,000건이 있다면 인덱스를 사용하면 1번의 연산으로 결과를 찾을 수 있지만,
  순차 검색을 사용한다면 최악의 경우 100,000번의 연산이 필요하다.
  배열의 들어있는 데이터의 크기가 증가할 수록 그 차이는 매우 커진다.
- 따라서 인덱스를 사용할 수 있다면 최대한 활용하는 것이 좋다.

배열의 데이터 추가
- 추가는 기존 데이터를 유지하면서 새로운 데이터를 입력하는 것을 뜻한다. 참고로 데이터를 중간에 추가하면 기존 데이터가
  오른쪽으로 한 칸씩 이동해야 된다.
- 이 말을 좀 더 쉽게 풀어보면, 데이터를 추가하려면 새로운 데이터를 입력할 공간을 확보해야 한다.

- 배열의 첫 번째 위치에 데이터 추가
  시간복잡도
  - 첫 번째 위치를 찾는 것 -> O(1)
  - 모든 데이터를 배열의 크기만큼 한 칸씩 이동 -> O(n)
  - O(1+n) => O(n)
- 배열의 중간 위치에 데이터 추가
  시간 복잡도
  - 중간의 특정 위치를 찾는 것 -> O(1)
  - 평균 연산 -> O(n/2)
  - O(1+n/2) -> O(n/2) => O(n)
- 배열의 마지막 위치에 데이터 추가
  - 배열의 길이를 사용하면 마지막 인덱스에 바로 접근할 수 있다.
  - O(1)
 */