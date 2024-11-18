import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng tỉ phú của danh sách: ");

        //Nhập và kiểm tra điều kiện:
        int size = new Scanner(System.in).nextInt();
        while (size > 20) {
            System.out.println("Nhập quá số lượng cho phép là 20, mời nhập lại: ");
            size = new Scanner(System.in).nextInt();
        }

        //Nhập từng giá trị cho mảng:
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập tài sản tỉ phú thứ " + (i + 1) + ": ");
            array[i] = new Scanner(System.in).nextDouble();
        }

        //Tìm giá trị lớn nhất:
        double max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i+1;
            }
        }

        //in kết quả:
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là: " + max);
        System.out.println("Vị trí là: " + index);

    }
}
