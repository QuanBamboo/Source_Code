package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    //Tính diện tích:
    public double getArea() {
        return this.width * this.height;
    }

    //Tính chu vi:
    public double getPerimeter() {
        return (this.width * this.height) * 2;
    }
}
