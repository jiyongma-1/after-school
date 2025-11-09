package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

        // 인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 테스트 종료");
    }
}
