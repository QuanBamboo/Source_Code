package QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập số c: ");
        double c = sc.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);
        if (q.getDelta() == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 =  " + q.getRoot1());
        } else if (q.getDelta() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1= " + q.getRoot1());
            System.out.println("x2= " + q.getRoot2());
        }

    }


}
