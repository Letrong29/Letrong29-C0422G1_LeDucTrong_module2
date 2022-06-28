package ss17_IO_Binary_File_and_Serialization.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(String path,List<Student> studentList){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(studentList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<Student> readDataFormFile(String Path){
        List<Student> studentList = new ArrayList<>();
        File file = new File(Path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
             fileInputStream =new FileInputStream(file);
             objectInputStream= new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        studentList.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        studentList.add(new Student(3, "Đặng Huy Hòa", "Đà Nẵng"));
        studentList.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        studentList.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        String STUDENT_TXT = "src/ss17_IO_Binary_File_and_Serialization/thuc_hanh/student.txt";
        writeToObject(STUDENT_TXT,studentList);
        List<Student> students = readDataFormFile(STUDENT_TXT);
        for (Student o : students) {
            System.out.println(o);
        }
    }
}
