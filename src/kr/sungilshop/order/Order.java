package kr.sungilshop.order;

import kr.sungilshop.product.Product;
import kr.sungilshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
