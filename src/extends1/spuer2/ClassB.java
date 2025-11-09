package extends1.spuer2;

public class ClassB extends ClassA {
    public ClassB(int a) {
//        super();    // 기본 생성자 생략 가능
        this(a, 0);
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
        super();    // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a= " + a + " b= " + b);
    }

}
/*
1. 클래스에 final 을 붙이면 -> 상속 불가.
2. 메소드에 final 을 붙이면 -> 오버라이딩 불가.
 */