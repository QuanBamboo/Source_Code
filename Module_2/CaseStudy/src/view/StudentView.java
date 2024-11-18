package view;

import entity.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    public void menuStudent() {
        int choice;
        List<Student> students;
        Student student;
        StudentService studentService = new StudentService();
        int id;
        while (true) {
            System.out.println("Menu quản lý học sinh");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm học sinh theo tên");
            System.out.println("6. Quay lại");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    students = studentService.getAll();
                    display(students);
                    break;
                case 2:
                    student = inputStudent();
                    studentService.save(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Nhập id cần sửa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    if (!studentService.isExistsStudent(id)) {
                        System.out.println("Id vừa nhập không tồn tại trong danh sách");
                    } else {
                        Student s = inputStudent();
                        studentService.remove(id);
                        studentService.save(s);
                        System.out.println("Sửa thông tin thành công!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập id cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    boolean isFind = studentService.isExistsStudent(id);
                    if (!isFind) {
                        System.out.println("Không tìm thấy student có id là " + id);
                    } else {
                        System.out.println("Bạn có chắc muốn xóa hay không. Nhấn Y nếu đồng ý hoặc bất kỳ kí tự khác nếu không?");
                        String isConfirm = scanner.nextLine();
                        if (isConfirm.equalsIgnoreCase("y")) {
                            studentService.remove(id);
                            System.out.println("Xóa học sinh thành công");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Tìm kiếm học sinh theo tên");
                    String name = scanner.nextLine();
                    students = studentService.findByName(name);
                    display(students);
                    break;

                case 6:
                    return;
            }
        }

    }


    public Student inputStudent() {
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
        System.out.print("Mời bạn nhập điểm: ");
        double point = Double.parseDouble(scanner.nextLine());
//        Định dạng chuỗi CXXXX(M|L)X-JV103
        System.out.print("Mời bạn nhập lớp: ");
        String className = scanner.nextLine();
        return new Student(id, name, address, point, className);
    }

    public void display(List<Student> students) {
        System.out.println("Hiển thị danh sách học sinh");
        for (Student student : students) {
            System.out.println(student);
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
