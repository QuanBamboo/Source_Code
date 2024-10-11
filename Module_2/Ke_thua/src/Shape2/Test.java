package Shape2;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,10,15);
        System.out.println(triangle.toString());
        System.out.println("Diện tích là: " + triangle.getArea());
        System.out.println("Chu vi là: " + triangle.getPerimeter());

    }
}
