package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYearB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isDivisbleBy4 = year % 4 == 0;
        if (isDivisbleBy4){
            boolean isDivisbleBy100 = year % 100 == 0;
            if (isDivisbleBy100){
                boolean isDivisble400 =year % 400 == 0;
                if (isDivisble400){
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
