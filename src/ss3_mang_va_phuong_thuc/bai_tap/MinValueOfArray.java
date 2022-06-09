package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class MinValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kích thước cho mảng");
        int size = Integer.parseInt(scanner.nextLine());


        System.out.println("giá trị nhỏ nhất là " + CheckMinValue(initializationArray(size)));

    }
    public static int[] initializationArray (int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phân tử cho mảng tại index " + i );
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }
    public static int CheckMinValue(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
