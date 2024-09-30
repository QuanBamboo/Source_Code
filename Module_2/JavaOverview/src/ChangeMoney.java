import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        System.out.println("Nhập tỉ giá: ");
        double rate = new Scanner(System.in).nextDouble();
        System.out.println("Nhập USD: ");
        double usd = new Scanner(System.in).nextDouble();
        double vnd = usd * rate;
        System.out.println(usd + " USD tương đương với "+ vnd + " VND");
    }
}
