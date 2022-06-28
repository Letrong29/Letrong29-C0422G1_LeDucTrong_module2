package ss17_IO_Binary_File_and_Serialization.thuc_hanh;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String anderess;

    public Student(int id, String name, String anderess) {
        this.id = id;
        this.name = name;
        this.anderess = anderess;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnderess() {
        return anderess;
    }

    public void setAnderess(String anderess) {
        this.anderess = anderess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", anderess='" + anderess + '\'' +
                '}';
    }
}
