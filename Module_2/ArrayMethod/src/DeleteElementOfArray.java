import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Nhập mảng từ bàn phím:
        System.out.println("Nhập độ dài mảng: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.println("Mảng trước khi xóa: ");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println("");
        //2. Nhập giá trị muốn xóa
        System.out.println("Nhập giá trị muốn xóa: ");
        int deleteValue = sc.nextInt();

        //3. Tìm vị trí giá trị đó trong mảng:
        int index=0;
        boolean check = false;
        for (int i = 0; i < length; i++) {
            if (array[i] == deleteValue) {
                index = i;
                check = true;
                break;
            }
        }
        //4. Thực hiện xóa:
        if (check) {
            for (int i = index; i < length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[length - 1] = 0;

            System.out.println("Mảng sau khi xóa: ");
            for (int i = 0; i < length; i++) {
                System.out.print("\t" + array[i]);
            }

        } else {
            System.out.println("Không tìm thấy " + deleteValue);
        }
    }
}
