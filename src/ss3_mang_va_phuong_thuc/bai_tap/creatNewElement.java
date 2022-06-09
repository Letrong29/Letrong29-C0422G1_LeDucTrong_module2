package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class creatNewElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,0,0,0,0,0};
        System.out.println("mảng bang đầu");
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập phần tử mới cho mảng");
        int newElement = Integer.parseInt(scanner.nextLine());
        int index = 0;
        do {
            System.out.println("nhập vị trí muốn chằn");
            index = Integer.parseInt(scanner.nextLine());
        }while ( index < 0||index >= arr.length-1);
        System.out.println(Arrays.toString(creatNewElement(arr,newElement,index)));

    }
    public static int[] creatNewElement(int[] array, int newElement, int index){

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                for (int j = array.length-1 ; j > index; j--) {
                   array[j] = array[j-1];
                }
                array[i] = newElement;
            }
        }
        return array;
    }
}
