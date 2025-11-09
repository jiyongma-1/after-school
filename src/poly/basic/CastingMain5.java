package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

//        new Parent() instanceof Parent // true
//        Parent p = new Parent();
//
//        new Child() instanceof Parent // true
//        Parent p = new Child();
//
//        new Parent() instanceof Child // false
//        Child c = new Parent();
//
//        new Child() instanceof Child // true
//        Child c = new Child();
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
    // instanceof 키워드는 오르쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우 true를 반환한다.
    // 쉽게 정리하면, 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해 보면 된다.

}
