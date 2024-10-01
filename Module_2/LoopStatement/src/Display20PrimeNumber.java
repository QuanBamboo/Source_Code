import java.util.Scanner;

public class Display20PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần hiển thị: ");
        int quantity = sc.nextInt();
        int count1 = 0, count2 = 0;
        int N = 2;

        while (count1 < quantity) {
            for (int i = 2; i <=Math.sqrt(N); i++) {
                if (N % i == 0) {
                    count2++;
                    break;
                }
            }
            if (count2 == 0) {
                System.out.print("\t"+N);
                count1++;
            }
            N++;
            count2=0;

        }


    }
}
