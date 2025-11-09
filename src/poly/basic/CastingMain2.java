package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스(객체) 참조 (다형적 참조)
        Parent poly = new Child();
        poly.parentMethod();

        // 다운캐스팅(부모타입 -> 자식타입)
        ((Child) poly).childMethod();

        // 업캐스팅: 부모타입으로 변경
        // 다운캐스팅: 자식타입으로 변경

    }
}
