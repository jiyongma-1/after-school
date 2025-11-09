package generics;

public class Generics2 {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

// 타입 매개변수의 종류
// 1. T: Type
// 2. E: Element
// 3. K: Key
// 4. V: Value