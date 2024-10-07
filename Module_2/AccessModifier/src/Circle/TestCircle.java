package Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("----Trước khi thay đổi static----");
        System.out.println("Diện tích là : " + c.getArea());
        System.out.println("Chu vị là: " + c.getPerimeter());

        System.out.println("----Sau khi thay đổi static-----");
        System.out.println("Diện tích là: " + Circle.getArea());
        System.out.println("Chu vị là: " + Circle.getPerimeter());


    }
}
