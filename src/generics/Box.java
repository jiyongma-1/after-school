package generics;

public class Box <T, U>{
    private T item1;
    private U item2;

    public Box(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public U getItem2() {
        return item2;
    }

    public void displayItems() {
        System.out.println("item 1: " + item1 + ", item 2: " + item2);
    }
}
