package entity;

import java.io.Serializable;

public class Teacher extends Person implements Serializable, Comparable<Teacher> {
    private String subject;

    public Teacher() {
    }


    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(int iD, String name, String address, String subject) {
        super(iD, name, address);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ID= " + getiD() + ", name= " + getName() + ", address = " + getAddress() +
                ", subject='" + subject + '\'' +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
