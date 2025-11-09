package generics;

public class GenericClass2 {
    public static void main(String[] args) {

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("로미오");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

//        c6Name = c5.name;
    }
}
