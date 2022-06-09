package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arA = new int[3];
        int[] arB = new int[3];

        for (int i = 0; i < arA.length; i++) {
            System.out.println("nhập phần tử cho mảng A tại " + " index " + i);
            arA[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arB.length; i++) {
            System.out.println("nhập phần tử cho mảng B tại " + " index " + i);
            arB[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arA));
        System.out.println(Arrays.toString(arB));
        System.out.println("mảng mới là");

        System.out.println(Arrays.toString(mixArray(arA, arB)));

    }
    public static int[] mixArray(int[] arA, int[] arB){
        int[] arC = new int[arA.length + arB.length];
        int index = 0;
        for (int i = 0; i < arA.length; i++) {
            arC[i] = arA[i];
            index = i;
        }
        int a = 0;
        for (int i = index+1; i < arC.length ; i++) {
            arC[i] = arB[a];
            a++;
        }
        return arC;
    }
}
