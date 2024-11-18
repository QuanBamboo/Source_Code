import java.util.Scanner;

public class CaculatorOneColumnOf2WayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng:  ");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int cols = sc.nextInt();

        System.out.println("Nhập các phần tử của mảng");
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }


        //in mảng:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Bạn muốn tính tổng cột nào?");
        int choice = sc.nextInt();
        while (choice < 0 || choice > cols) {
            System.out.println("Cột không hợp lệ, nhập lại nha: ");
            choice = sc.nextInt();
        }

        int sum = 0;
        //tính tổng
        for (int i = 0; i < rows; i++) {
            sum += array[i][choice];
        }

        System.out.println("Kết quả là: " + sum);
    }
}
