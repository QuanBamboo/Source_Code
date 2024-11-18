package ss8_clean_code.repository;

import ss8_clean_code.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
//    Generic
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(2, "Nguyễn Văn B", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(3, "Nguyễn Văn C", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(4, "Nguyễn Văn D", "Hà Nội", 10, "C0724G1"));
    }

    public List<Student> getAll() {
        return students;
    }

    public void save(Student s) {
        students.add(s);
    }
}
