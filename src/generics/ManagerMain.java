package generics;

public class ManagerMain {
    public static void main(String[] args) {
        User user = new User("John Doe");
        Product product = new Product("Laptop", 1500);

        Manager<User, Product> manager = new Manager<>(user, product);
        manager.displayInfo();
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

/*
사용자와 상품 정보를 저장하고 관리하는 제네릭 클래스를 구현하시오.
1. 클래스 이름 : Manager
2. 제네릭 타입 : 두개의 타입 매개변수 U와 P를 가진다. U는 사용자 타입(User), P는 상품 타입(Product)
3. 필드
    사용자 정보를 담는 user (타입:U)
    상품 정보를 담는 product (타입:P)
4. 생성자 : 사용자와 상품을 매개변수로 받아 각각 user와 product를 초기화하시오.
5. 메서드
    getUser() : 사용자 정보 반환
    getProduct() : 상품 정보 반환
    displayInfo() : 사용자와 상품 정보를 출력한다.

출력예시
User: John Doe
Product: Laptop, Price: 1500.0
 */