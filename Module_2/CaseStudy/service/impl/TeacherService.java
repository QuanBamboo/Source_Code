package ss8_clean_code.service.impl;

import ss8_clean_code.entity.Teacher;
import ss8_clean_code.service.ITeacherService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements ITeacherService {

    public static final String SRC_TEACHER = "src/CaseStudy/data/teacher.dat";

    @Override
    public List<Teacher> getAll() {
        List<Teacher> teachers = new ArrayList<>();
        File file = new File(SRC_TEACHER);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            teachers = (List<Teacher>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy class");
        }
        return teachers;
    }

    @Override
    public void save(Teacher t) {
        List<Teacher> teachers = getAll();
        teachers.add(t);
        writeFileBinary(teachers);
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
        writeFileBinary(teachers);
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
        writeFileBinary(teachers);
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

    public void writeFileBinary(List<Teacher> teachers) {
        File file = new File(SRC_TEACHER);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(teachers);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    //Kiểm tra Student có ID có tồn tại không?
    public boolean isExistsTeachers(int id) {
        if (findById(id) != null) {
            return true;
        }
        return false;
    }


}
