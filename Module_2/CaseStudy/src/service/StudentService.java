package service;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    public static final String SRC_STUDENT = "src/data/student.txt";


    //Hiển thị danh sách
    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(SRC_STUDENT);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            if (e.getMessage() != null) {
                System.out.println("Lỗi đọc file");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy class");
        }
        return students;
    }


    //Thêm mới
    @Override
    public void save(Student s) {
        List<Student> students = getAll();
        students.add(s);
        writeDataToFile(students);

    }


    //Sửa thông tin theo id
    @Override
    public void update(int id, Student s) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getiD() == id) {
                student = s;
                break;
            }
        }
        writeDataToFile(students);
    }

    //Xóa theo id

    @Override
    public void remove(int id) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getiD() == id) {
                students.remove(student);
                break;
            }
        }
        writeDataToFile(students);
    }


    //Nhập thông tin từ bàn phím
    public Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        double point;
        while (true) {
            System.out.print("Mời bạn nhập ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (isExistsStudent(id)) {
                    System.out.println("ID đã tồn tại, mời nhập lại");
                } else
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập định dạng số");
            }
        }

        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();

        while (!name.matches("^[A-Z][a-z ]{5,100}$")) {
            System.out.println("Bạn nhập sai định dạng tên");
            System.out.print("Mời bạn nhập lại: ");
            name = scanner.nextLine();
        }


        System.out.print("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();

        while (true) {
            System.out.print("Mời bạn nhập điểm: ");
            try {
                point = Double.parseDouble(scanner.nextLine());
                if (point < 0 || point > 10) {
                    System.out.println("Nhập điểm không hợp lệ, vui lòng nhập lại!");
                } else
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập đúng định dạng số thực");
            }
        }

        System.out.print("Mời bạn nhập lớp: ");
        String className = scanner.nextLine();


        return new Student(id, name, address, point, className);
    }

    //Tìm kiếm theo ID
    @Override
    public Student findById(int id) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getiD() == id) {
                return student;
            }
        }
        return null;
    }


    //Tìm kiếm theo tên
    @Override
    public List<Student> findByName(String name) {
        List<Student> students = getAll();
        List<Student> temp = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(name)) {
                temp.add(student);
            }
        }
        return temp;
    }


    //Viết vào file
    public void writeDataToFile(List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(SRC_STUDENT);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    //Kiểm tra Student có ID có tồn tại không?
    public boolean isExistsStudent(int id) {
        if (findById(id) != null) {
            return true;
        }
        return false;
    }

}
