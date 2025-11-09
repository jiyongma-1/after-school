package generics;

public class Manager <U, P> {
    private U user;
    private P product;

    public Manager(U user, P product) {
        this.user = user;
        this.product = product;
    }

    public U getUser() {
        return user;
    }

    public P getProduct() {
        return product;
    }

    public void displayInfo() {
        // user와 product가 각각 User와 Product 타입인지 확인
        if (user instanceof User && product instanceof Product) {
            // user를 User 타입으로 형변환 (다운캐스팅)
            User u = (User) user;
            Product p = (Product) product;

            System.out.println("User: " + u.getName());
            System.out.println("Product: " + p.getName() + ", Price: " + p.getPrice());
        } else {
            System.out.println("Unknown types");
        }

    }
}
