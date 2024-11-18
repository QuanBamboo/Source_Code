package service;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudent {
    public static final String SRC_STUDENT = "src/CaseStudy/data/student.dat";


    //Hiển thị danh sách
    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        File file = new File(SRC_STUDENT);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
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
        writeFileBinary(students);
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
        writeFileBinary(students);
    }

    //Xóa

    @Override
    public void remove(int id) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getiD() == id) {
                students.remove(student);
                break;
            }
        }
        writeFileBinary(students);
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
    public void writeFileBinary(List<Student> students) {
        File file = new File(SRC_STUDENT);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
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
