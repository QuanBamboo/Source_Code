import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần vay: ");
        double tienVay = scanner.nextDouble();
        System.out.println("Nhập lãi suất theo năm: ");
        double laiSuat = scanner.nextDouble();
        System.out.println("Nhập số tháng cần vay: ");
        byte thang = scanner.nextByte();

        double sum = 0;

        for (int i = 0; i < thang; i++) {
            sum += tienVay * (laiSuat / 12) * thang;
        }
        System.out.println("Tổng số tiền cần trả là: " + sum);

    }
}
