package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);

    }
}
/*
    이제 stringList는 String 문자열만 보관하고 조회하고, intList 에는 Integer 숫자만 보관하고 조회할 수 있다.
    다른 타입의 값을 저장하면 컴파일 오류가 발생한다.
    추가로 값을 조회할 때도 위험한 다운 캐스팅 없이 지정한 타입으로 안전하게 조회할 수 있다.
    제네릭을 사용한 덕분에 타입 인자를 지정한 타입으로만 안전하게 데이터를 저장하고, 조회할 수 있게 되었다.
    제네릭의 도움으로 타입 안전성이 높은 자료 구조를 만들 수 있었다.
 */