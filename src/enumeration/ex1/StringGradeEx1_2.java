package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int vip = discountService.discount("VIP", price);
        int goldd = discountService.discount("GOLDD", price);
        int diamond = discountService.discount("diamond", price);

        System.out.println("BASIC 등급의 할인 금액: " + vip);
        System.out.println("GOLD 등급의 할인 금액: " + goldd);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
