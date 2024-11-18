package ss8_clean_code.entity;


public class Student extends Person implements Comparable<Student> {
    private double point;
    private String className;

    public Student() {
    }


    public Student(int id, String name, String address, double point, String className) {
        super(id, name, address);
        this.point = point;
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "point=" + point +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getiD() > o.getiD()) {
            return 1;
        } else if (this.getiD() == o.getiD()) {
            return this.getName().compareTo(o.getName());
        }
        return -1;
    }
}
