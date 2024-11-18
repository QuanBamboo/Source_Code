package view;

import entity.Teacher;
import service.TeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    public void menuTeacher() {
        int choice;
        List<Teacher> teachers;
        Teacher teacher;
        TeacherService teacherService = new TeacherService();
        int id;
        while (true) {
            System.out.println("Menu quản lý giảng viên");
            System.out.println("1. Hiển thị danh sách giảng viên");
            System.out.println("2. Thêm mới giảng viên");
            System.out.println("3. Sửa thông tin giảng viên");
            System.out.println("4. Xóa giảng viên");
            System.out.println("5. Tìm kiếm giảng viêntheo tên");
            System.out.println("6. Quay lại");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    teachers = teacherService.getAll();
                    display(teachers);
                    break;
                case 2:
                    teacher = inputTeacher();
                    teacherService.save(teacher);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Nhập id cần sửa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    if (!teacherService.isExistsTeachers(id)) {
                        System.out.println("Id vừa nhập không tồn tại trong danh sách");
                    } else {
                        Teacher t = inputTeacher();
                        teacherService.remove(id);
                        teacherService.save(t);
                        System.out.println("Sửa thông tin thành công!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập id cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    boolean isFind = teacherService.isExistsTeachers(id);
                    if (!isFind) {
                        System.out.println("Không tìm thấy student có id là " + id);
                    } else {
                        System.out.println("Bạn có chắc muốn xóa hay không. Nhấn Y nếu đồng ý hoặc bất kỳ kí tự khác nếu không?");
                        String isConfirm = scanner.nextLine();
                        if (isConfirm.equalsIgnoreCase("y")) {
                            teacherService.remove(id);
                            System.out.println("Xóa học sinh thành công");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Tìm kiếm giảng viên theo tên");
                    String name = scanner.nextLine();
                    teachers = teacherService.findByName(name);
                    display(teachers);
                    break;

                case 6:
                    return;
            }
        }

    }

    public static Teacher inputTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập ID: ");

        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();

        while (!name.matches("^[A-Z][a-z ]{5,100}$")) {
            System.out.println("Bạn nhập sai định dạng tên");
            System.out.print("Mời bạn nhập lại: ");
            name = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Mời bạn nhập môn dạy: ");
        String subject = scanner.nextLine();
        return new Teacher(id, name, address, subject);
    }

    public void display(List<Teacher> teachers) {
        System.out.println("Hiển thị danh giảng viên");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public int inputChoice() {
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

}

