package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫 번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫 번째 위치에 추가
        System.out.println("배열의 첫 번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        // 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i=arr.length-1; i>index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }

    private static void addLast(int[] arr, int value) {
        arr[arr.length-1] = value;
    }
}
/*
배열의 한계
- 배열은 가장 기본적인 자료구조이고, 특히 인덱스를 사용할 때 최고의 효율이 나온다.
- 배열은 배열을 생성하는 시점에서 배열의 크기를 미리 정해야 한다는 점이 단점으로 들어날 때가 있다.
- 이벤트 응모처럼 총 결과가 정해지지 않은 경우 정적인 배열에 사용이 단점이 될 수 있다.
- 배열처럼 처음부터 정적으로 길이가 정해져 있는 것이 아니라, 동적으로 언제든지 길이를 늘리고 줄일 수 있는 자료구조가 필요하다.
 */