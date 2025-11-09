package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();
}
/*
모든 메서드가 추상 메서드인 추상 클래스를 "순수 추상 클래스" 라고 부른다.

순수 추상 클래스의 특징
1. 인스턴스를 생성할 수 없다.
2. 상속시 자식은 모든 메서드를 오버라이딩 해야 한다.
3. 주로 다형성을 위해 사용된다.

-> 자바는 순수 추상 클래스를 더 편리하게 사용할 수 있도록 인터페이스라는 개념을 제공한다.
 */
