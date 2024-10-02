import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int length = sc.nextInt();
        while (length > 20) {
            System.out.println("Nhập quá số lượng cho phép, mời nhập lại: ");
            length = sc.nextInt();
        }
        int[] array = new int[length];
        //Nhập dữ liệu cho mảng:
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        //In mảng:
        System.out.println("Mảng trước đảo ngược: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + array[i]);
        }

        //Đảo ngược mảng:

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        System.out.println("");
        System.out.println("Mảng sau đảo ngược: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + array[i]);
        }
    }
}
