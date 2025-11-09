package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int goldd = discountService.discount("GOLDD", price);
        System.out.println("GOLD 등급의 할인 금액: " + goldd);

        // 소문자 입력
        int diamond = discountService.discount("diamond", price);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
