import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều cao: ");
        float height = sc.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        float width = sc.nextFloat();
        float area = width * height;
        float perimeter = (width + height) * 2;
        System.out.println("Diện tích hình chữ nhật là: " + area);
        System.out.println("Chu vị hình chữ nhật là: " + perimeter);
    }
}
