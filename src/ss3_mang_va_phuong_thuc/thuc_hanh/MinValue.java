package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArr = new int[5];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = Integer.parseInt(scanner.nextLine());
        }
        //cho người dùng nhập phân tử myArr

        System.out.println(Arrays.toString(myArr));
        System.out.println("min value of myArr = " + minValue(myArr));
        //gọi hàm minValue và truyền vào đối số là mảng myArr

    }
    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    //hàm tìm giá trị nhỏ nhất

}
