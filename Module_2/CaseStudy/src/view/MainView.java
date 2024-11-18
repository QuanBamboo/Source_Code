package view;

public class MainView {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        TeacherView teacherView = new TeacherView();

        while (true) {
            System.out.println("--------- Quản lý nhân sự công ty giáo dục------------");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = studentView.inputChoice();
            switch (choice) {
                case 1:
                    studentView.menuStudent();
                    break;
                case 2:
                    teacherView.menuTeacher();
                    break;
                case 3:
                    return;
            }
        }

    }
}
