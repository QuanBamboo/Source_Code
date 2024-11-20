package service;



import entity.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacher {
    public static final String SRC_TEACHER = "src/data/teacher.txt";

    @Override
    public List<Teacher> getAll() {
        List<Teacher> teachers = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(SRC_TEACHER);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            teachers = (List<Teacher>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy class");
        }
        return teachers;
    }



    public Teacher inputTeacher() {
        Scanner scanner = new Scanner(System.in);
        int id;

        while (true) {
            System.out.print("Mời bạn nhập ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (isExistsTeachers(id)) {
                    System.out.println("ID đã tồn tại, mời nhập lại");
                } else
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập đúng định dạng số");
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

        System.out.print("Mời bạn nhập môn dạy: ");
        String subject = scanner.nextLine();
        return new Teacher(id, name, address, subject);
    }

    @Override
    public void save(Teacher t) {
        List<Teacher> teachers = getAll();
        teachers.add(t);
        writeDataToFile(teachers);

    }

    @Override
    public void update(int id, Teacher t) {
        List<Teacher> teachers = getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getiD() == id) {
                teacher = t;
                break;
            }
        }
        writeDataToFile(teachers);
    }


    @Override
    public void remove(int id) {
        List<Teacher> teachers = getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getiD() == id) {
                teachers.remove(teacher);
                break;
            }
        }
        writeDataToFile(teachers);
    }

    @Override
    public Teacher findById(int id) {
        List<Teacher> teachers = getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getiD() == id) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public List<Teacher> findByName(String name) {
        List<Teacher> teachers = getAll();
        List<Teacher> temp = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getName().contains(name)) {
                temp.add(teacher);
            }
        }
        return temp;
    }


    public void writeDataToFile(List<Teacher> teachers) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(SRC_TEACHER);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(teachers);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }


    public boolean isExistsTeachers(int id) {
        if (findById(id) != null) {
            return true;
        }
        return false;
    }
}
