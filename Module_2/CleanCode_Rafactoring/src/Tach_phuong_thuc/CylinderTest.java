package Tach_phuong_thuc;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập raidus: ");
        int radius = scanner.nextInt();
        System.out.println("Nhập height: ");
        int height = scanner.nextInt();
        System.out.println("Chu vi đáy là: " + Cylinder.getPerimeter(radius));
        System.out.println("Diện tích đáy: " + Cylinder.getBaseArea(radius));
        System.out.println("Thể tích: " + Cylinder.getVolume(radius, height));
    }
}
