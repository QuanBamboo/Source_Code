import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {

        String[] students = new String[]{"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm kiếm: ");
        String name = sc.nextLine();
        boolean check = true;
        //duyệt mảng:
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí tìm thấy là: " + (i + 1));
                check = false;
                break;
            }

        }
        if (check)
            System.out.println("Không tìm thấy tên trong danh sách");

    }
}
