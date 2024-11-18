import java.util.Scanner;

public class So_lan_xuat_hien_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập ký tự cần kiểm tra: ");
        char ch = sc.next().charAt(0);

        //Duyệt chuối
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện ký tự " + ch + " là: " + count);
    }
}
