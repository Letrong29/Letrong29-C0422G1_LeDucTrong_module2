package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listSize;
        do {
            System.out.println("nhập số lượng danh sách không quá 20 người");
            listSize = Integer.parseInt(scanner.nextLine());
            if (listSize > 20){
                System.out.println("bạn đã nhập quá 20 người");
            }
        }while (listSize > 20 || listSize < 0);
        //nhập kích thước cho mảng

        int[] list = new int[listSize];

        for (int i = 0; i < list.length; i++) {
            System.out.println("nhập số tài sản");
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        //tạo mảng, cho người dùng nhập phần tử của mảng

        int max = list[0];
        int index = 0;
        for (int i = 1; i < list.length; i++) {
            if (max < list[i]){
                max = list[i];
                index += i;
            }
        }
        System.out.println("giá trị tài sản lớn nhất trong danh sách là " + max);
        System.out.println("được tìm thấy tại vị trí " + index);

    }
}
