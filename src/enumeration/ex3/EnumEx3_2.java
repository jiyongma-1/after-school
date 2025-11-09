package enumeration.ex3;

public class EnumEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

//        Grade myGrade = new Grade(); enum 생성 불가

        // 열거형(Enum)의 장점
        // 1. 타입 안정성 향상 : 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력될 가능성이 없다.
        // 2. 간결성 및 일관성 : 열거형은 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장된다.
        // 3. 확장성 : 새로운 회원 등급을 추가하고 싶을 때, ENUM에 새로운 상수를 추가하면 된다.
    }
}
