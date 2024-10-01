import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.println("Nhập số cần kiểm tra: ");
        int number = new Scanner(System.in).nextInt();

        int count = 0;
        if (number < 2) {
            System.out.println("Số " + number + " không phải là số nguyên tố");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Số " + number + " là số nguyên tố");
            } else {
                System.out.println("Số " + number + " không phải là số nguyên tố");
            }
        }

    }
}
