import java.util.Scanner;

public class InsertElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Mảng trước khi chèn: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println("");

        System.out.println("Nhập giá trị cần chèn: ");
        int value = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();

        if (index < 0 || index > length)
            System.out.println("Không chèn được");
        else
            array[index] = value;


        System.out.println("Mảng sau khi chèn: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + array[i]);
        }
    }
}
