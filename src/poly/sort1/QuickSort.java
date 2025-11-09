package poly.sort1;

public class QuickSort implements Sort {

    private String name = "QuickSort";

    @Override
    public void ascending(int[] nums) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println(name + " descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println(name + "입니다.");
    }
}
