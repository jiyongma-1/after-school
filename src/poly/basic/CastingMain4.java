package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();   // 문제 없이 실행 됨. 다운캐스팅 잘 됨.

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;  // ClassCastException 이라는 런타임 오류 발생.
        child2.childMethod();

    }
}
