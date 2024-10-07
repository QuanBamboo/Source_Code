package Rectangle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập width: ");
        double width = sc.nextDouble();
        System.out.println(" Nhập height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        //Hiển thị:
        System.out.println(rectangle.toString());

        //Hiển thị diện tích:
        System.out.println("Diện tích là: " + rectangle.getArea());

        //Hiển thị chu vi:
        System.out.println("Chu vị là: " + rectangle.getPerimeter());
    }
}
