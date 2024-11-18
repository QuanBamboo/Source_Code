package ss8_clean_code.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {
    private int iD;
    private String name;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String address) {
        this.iD = id;
        this.name = name;
        this.address = address;
    }

    public long getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return iD == person.iD && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + iD +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
