package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số A");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số B");
        int b = Integer.parseInt(scanner.nextLine());

        if (a == 0 || b == 0){
            System.out.println(a + " và " + b + " không có ước số chung");
        }else {
            while (a != b){
                if (a > b){
                    a -= b;
                }else {
                    b -= a;
                }
            }
            System.out.println("ước số chung lớn nhất của 2 số trên là " + a);
        }
    }
}
