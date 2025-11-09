package lang.object.test;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

//    hashCode() {}
    @Override
    public boolean equals(Object o) {
        System.out.println("this : " + this + ", o: " + o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        System.out.println("rectangle.width: " + rectangle.width + ", width: " + width + ", rectangle.height: " + rectangle.height + ", height: " + height);
        return width == rectangle.width && height == rectangle.height;
    }

//    toString() {}
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
