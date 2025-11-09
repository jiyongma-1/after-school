package generics;

public class Manager2 <U extends User, P extends Product> {
    private U user;
    private P product;

    public Manager2(U user, P product) {
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
        System.out.println("User: " + user.getName());
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
    }
}
