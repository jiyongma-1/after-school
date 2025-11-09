package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println();

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);
        poly.method();

        // 다형성을 이루는 또 하나의 중요한 핵심 이론은 바로 메서드 오버라이딩이다.
        // 오버라이딩 된 메서드가 항상 우선권을 가진다.
    }
}