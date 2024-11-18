package ss8_clean_code.controller;

import ss8_clean_code.entity.Student;
import ss8_clean_code.service.IStudentService;
import ss8_clean_code.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public List<Student> searchByName(String name) {
        return studentService.findByName(name);
    }

    public void save(Student student) {
        studentService.save(student);
    }
}
