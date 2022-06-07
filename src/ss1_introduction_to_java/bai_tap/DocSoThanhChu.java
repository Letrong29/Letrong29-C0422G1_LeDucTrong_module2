package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (num < 20) {
            switch (num) {
                case 10:
                    System.out.println("ten, ones = 0");
                    break;
                case 11:
                    System.out.println("eleven, ones = 1");
                    break;
                case 12:
                    System.out.println("twelve, ones = 2");
                    break;
                case 13:
                    System.out.println("thirteen, ones = 3");
                    break;
                case 14:
                    System.out.println("fourteen, ones = 4");
                    break;
                case 15:
                    System.out.println("fifteen, ones = 5");
                    break;
                case 16:
                    System.out.println("sixteen, ones = 6");
                    break;
                case 17:
                    System.out.println("seventeen, ones = 7");
                    break;
                case 18:
                    System.out.println("eighteen, ones = 8");
                    break;
                case 19:
                    System.out.println("nineteen, ones = 9");
                    break;

            }
        }else {

        }
    }
}
