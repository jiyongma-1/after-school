package oop.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        for(int i=0;i<orders.length;i++){
            orders[i] = new ProductOrder();
        }

        orders[0].productName = "두부";
        orders[0].price = 2000;
        orders[0].quantity = 2;

        orders[1].productName = "김치";
        orders[1].price = 5000;
        orders[1].quantity = 1;

        orders[2].productName = "콜라";
        orders[2].price = 1500;
        orders[2].quantity = 2;

        int result = 0;

        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity + ", 구매량: " + (order.price * order.quantity) + "원");
            result += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액: " + result + "원");
    }
}