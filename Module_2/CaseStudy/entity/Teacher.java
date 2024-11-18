package ss8_clean_code.entity;

public class Teacher extends Person implements Comparable<Teacher>{

    private String subject;

    public Teacher() {
    }


    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(long iD, String name, String address, String subject) {
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
        return super.toString() + "Teacher{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
