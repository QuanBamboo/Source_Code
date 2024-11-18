import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng 1: ");
        int length1 = sc.nextInt();
        int[] array1 = new int[length1];
        System.out.println("Nhập các phần tử mảng 1: ");
        for (int i = 0; i < length1; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array1[i] = sc.nextInt();

        }

        System.out.println("Nhập độ dài mảng 2: ");
        int length2 = sc.nextInt();
        int[] array2 = new int[length2];
        System.out.println("\n Nhập các phần tử mảng 2: ");
        for (int i = 0; i < length2; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array2[i] = sc.nextInt();

        }

        int length3 = length1 + length2;
        int[] array3 = new int[length3];
        for (int i = 0; i < length1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            array3[length1+i] = array2[i];
        }


        System.out.println("Mảng sau khi gộp là: ");
        for (int i : array3) {
            System.out.print("\t" + i);

        }

    }
}
