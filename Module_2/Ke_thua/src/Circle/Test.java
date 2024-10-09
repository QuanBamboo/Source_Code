package Circle;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setColor("Red");
        c.setRadius(10);
        System.out.println("Thông tin Circle: " + c.toString());
        System.out.println("Diện tích là: " + c.getArea());

        Cylinder c1 = new Cylinder();
        c1.setColor("Blue");
        c1.setRadius(15);
        c1.setHeight(20);
        System.out.println("Thông tin Cylinder: " + c1.toString());
        System.out.println("Thể tích cylinder: " + c1.volume());
    }
}
