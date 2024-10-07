package Circle;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public static  double getArea() {
        return Math.PI * radius * radius;
    }

   public  static double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
