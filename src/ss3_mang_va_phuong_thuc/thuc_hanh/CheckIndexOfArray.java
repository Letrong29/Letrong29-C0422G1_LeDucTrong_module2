package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class CheckIndexOfArray {
    public static void main(String[] args) {
        String[] studentList = {"Bảo","Vinh","Thanh","Trọng"};

        System.out.println("nhập tên bạn muốn kiếm");
        Scanner scanner = new Scanner(System.in);
        String nameStudent = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (nameStudent.equals(studentList[i])){
                System.out.println(nameStudent + " nằm tại index " + i);
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("không tìm thấy " + nameStudent);
        }

    }
}
