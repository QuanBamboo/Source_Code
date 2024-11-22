package View;

import entity.Contact;
import service.ContactService;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        int choice;
        Contact contact;
        List<Contact> contacts;
        Scanner input = new Scanner(System.in);
        ContactService contactService = new ContactService();
        while (true) {
            System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ -------");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa ");
            System.out.println("5. Tìm kiếm ");
            System.out.println("6. Đọc vào file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách danh bạn là: ");
                    contacts = contactService.getAllContacts();
                    display(contacts);
                    break;
                case 2:
                    contact = contactService.inputContact();
                    contactService.saveContacts(contact);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Mời nhập số điện thoại: ");
                    int number = Integer.parseInt(input.nextLine());
                    boolean isFind1 = contactService.isExistsContact(number);
                    if (!isFind1) {
                        System.out.println("Không tìm thấy contact có số điện thoại là " + number);
                    } else {
                        System.out.println("---- Mời bạn sửa thông tin----");
                        System.out.println("Mời nhập tên mới: ");
                        String name = scanner.nextLine();
                        System.out.println("Mời nhập địa chỉ mới: ");
                        String address = scanner.nextLine();
                        System.out.println("Mời nhập email mới: ");
                        String email = scanner.nextLine();
                        System.out.println("Mời nhập facebook mới: ");
                        String facebook = scanner.nextLine();
                        Contact contact1 = new Contact(name, number, address, email, facebook);
                        contactService.update(number, contact1);
                        System.out.println("Cập nhật thành công");
                    }
                    break;

                case 4:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    int numberPhone = Integer.parseInt(scanner.nextLine());
                    boolean isFind = contactService.isExistsContact(numberPhone);
                    if (!isFind) {
                        System.out.println("Không tìm thấy contact có số điện thoại là " + numberPhone);
                    } else {
                        System.out.println("Bạn có chắc muốn xóa hay không. Nhấn Y nếu đồng ý hoặc bất kỳ kí tự khác nếu không?");
                        String isConfirm = scanner.nextLine();
                        if (isConfirm.equalsIgnoreCase("y")) {
                            contactService.remove(numberPhone);
                            System.out.println("Xóa thành công");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Tìm kiếm học viên theo số điện thoại");
                    int numberPhone2 = Integer.parseInt(scanner.nextLine());
                    contacts = (List<Contact>) contactService.findByNumberPhone(numberPhone2);
                    display(contacts);
                    break;
                case 6:

                    break;
                case 7:
                    

                    break;
                case 8:
                    return;
            }
        }

    }


    private static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai lựa chọn. Mời bạn nhập lại");
        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
        return 0;
    }

    private static void display(List<Contact> contacts) {
        System.out.println("Hiển thị danh sách học viên");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}
