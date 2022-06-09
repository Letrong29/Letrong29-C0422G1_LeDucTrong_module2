package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());


        checkMaxValue(creatAr2d(row,col));


    }
    public static double[][] creatAr2d(int row, int col){
        Scanner scanner = new Scanner(System.in);
        double[][] myArr2d = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập phân tử cho mảng 2 chiều tại " + "[" + i + "]" + "[" + j + "]" ) ;
                myArr2d[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        return myArr2d;
    }
    public static double checkMaxValue(double[][] ar2d){
        double max = ar2d[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < ar2d.length; i++) {
            for (int j = 0; j < ar2d[i].length; j++) {
                if (max < ar2d[i][j]){
                    max = ar2d[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max + " là giá trị lớn nhất tại index " + "[" + row + "]" + "[" + col + "]");
        return max;
    }

}
