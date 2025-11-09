package generics;

public class GenericClass1 {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("홍길동");
        c2.ready();

        System.out.println("--------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("장발장");
        c4.ready();

        System.out.println("--------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String) c3.name;
        // object 타입을 사용하면 타입 변환이 필요하다.
        // 타입 변환에 실수를 할 경우 런타임 오류가 발생한다.
    }
}
