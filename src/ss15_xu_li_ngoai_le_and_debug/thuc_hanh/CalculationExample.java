package ss15_xu_li_ngoai_le_and_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("tổng của x và y = " + a);
            System.out.println("hiệu của x và y = " + b);
            System.out.println("tích của x và y = " + c);
            System.out.println("thương của x và y = " + d);
        }catch (Exception e){
            System.out.println("xẩy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập y");
        int y = Integer.parseInt(scanner.nextLine());

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
