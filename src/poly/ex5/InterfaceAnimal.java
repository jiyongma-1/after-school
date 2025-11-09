package poly.ex5;

public interface InterfaceAnimal {
    double MY_PI = 3.14;

    void sound();
    void move();
}
/*
인터페이스
- 앞서 설명한 순수 추상 클래스와 같다.
- 인터페이스 메서드는 모두 public abstract 이다.
- 따라서 public abstract 생략 가능하며, 생략을 권장한다.
- 인터페이스는 다중 구현(다중 상속)을 지원한다.

인터페이스와 멤버 변수
- 인터페이스에서 멤버 변수는 public static final 이 모두 포함되었다고 간주한다.
- final은 변수의 값을 한 번 설정하면 수정할 수 없다는 뜻이다.
- 자바에서 static final을 사용해 정적이면서 고칠 수 없는 변수를 상수라 하고,
  관례상 상수는 대문자에 언더스코어로 구분한다.
- public static final은 생략이 가능하며, 생략을 권장한다.
 */