package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class delateElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = {1,9,2,8,3,7,4,6,5};

        System.out.println("nhập phần tử bạn muốn kiếm");
        int element;
        element = Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(delateElemnt(myArr, element)));

    }

    public static int[] delateElemnt(int[] arr, int element){

        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]){
                check = false;
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        if (check){
            System.out.println("not element");
        }
        return arr;
    }

}
