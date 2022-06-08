package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("nhập vào một số bất kỳ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        if (number < 2){
            System.out.println("đây không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i < number){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("đây là số nguyên tố");
            }else {
                System.out.println("đây không phải số nguyên tố");
            }
        }


    }
}
