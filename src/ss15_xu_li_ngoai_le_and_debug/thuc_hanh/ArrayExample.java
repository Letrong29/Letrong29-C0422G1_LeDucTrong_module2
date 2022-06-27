package ss15_xu_li_ngoai_le_and_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom(){
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("danh sách các phân tử trong mảng ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập index của 1 phần tử bất kỳ: ");

        int x = scanner.nextInt();
        try {
            System.out.println("giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("giá trị phần tử nhập quá giới hạn");
            System.out.println("phần tử đầu tiên: " + arr[0]);
        }
    }
}
