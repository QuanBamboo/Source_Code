import java.util.Scanner;

public class Tong_duong_cheo_ma_tran_vuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int value = sc.nextInt();

        int[][] array = new int[value][value];
        System.out.println("Nhập dữ liệu cho mảng: ");
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print("[" + i + "][" + j + "]= ");
                array[i][j] = sc.nextInt();
            }
        }

        //in mảng:
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print("\t " + array[i][j]);
            }
            System.out.println("");
        }

        int sum = 0;
        //tính tổng
        for (int i = 0; i < value; i++) {
            sum += array[i][i];
        }
        System.out.println(" Kết quả là: " + sum);


    }


}

