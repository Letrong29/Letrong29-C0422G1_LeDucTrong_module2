package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sizeArr;
        do {
            System.out.println("nhâp kích thước của mảng tối đa 20 phần tử");
            sizeArr = Integer.parseInt(scanner.nextLine());
        } while (sizeArr > 20 || sizeArr < 0);

        int[] myArr = new int[sizeArr];

        for (int i = 0; i < myArr.length; i++) {
            System.out.println("nhập phân tử tại index " + i);
            myArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(myArr));

        int first = 0;
        int last = myArr.length - 1;
        while (first < last) {
            int tmp;
            tmp = myArr[first];
            myArr[first] = myArr[last];
            myArr[last] = tmp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(myArr));
    }
}
