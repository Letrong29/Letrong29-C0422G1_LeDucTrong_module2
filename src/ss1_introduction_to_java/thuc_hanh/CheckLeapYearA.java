package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYearA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year%400==0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.println("is leap year");
        }else {
            System.out.println("is not leap year");
        }


    }
}
