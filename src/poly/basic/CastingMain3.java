package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // 업캐스팅 - 업캐스팅은 매우 자주 사용되기 때문에 생략 권장.
        Parent parent1 = (Parent) child;
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
