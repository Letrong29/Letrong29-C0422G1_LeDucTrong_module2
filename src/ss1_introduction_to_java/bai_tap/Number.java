package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num < 10) {
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
                default:
                    System.out.println("out of ability");
                    break;
            }
        } else if (num < 20) {
            int unit = num % 10;
            switch (unit) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (num < 99) {
            int tmp = num / 10; // hàng chục
            int unit = num % 10; // hàng đơn vị
            switch (tmp) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (unit){
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
                    break;
            }
        } else if (num < 1000){ // đọc những số từ 100 - 999
            int hundred = num / 100; // hàng trăm
            int tmp = (num / 10) % 10; // hàng chục  113
            int unit = num % 10; // hàng đơn vị
            switch (hundred){
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            if (tmp == 1){
                switch (unit){
                    case 0:
                        System.out.print(" end ten");
                    case 1:
                        System.out.print(" end eleven");
                        break;
                    case 2:
                        System.out.print(" end twelve");
                        break;
                    case 3:
                        System.out.print(" end thirteen");
                        break;
                    case 4:
                        System.out.print(" end fourteen");
                        break;
                    case 5:
                        System.out.print(" end fifteen");
                        break;
                    case 6:
                        System.out.print(" end sixteen");
                        break;
                    case 7:
                        System.out.print(" end seventeen");
                        break;
                    case 8:
                        System.out.print(" end eighteen");
                        break;
                    case 9:
                        System.out.print(" end nineteen");
                        break;
                }
            }else {
                switch (tmp){
                    case 2:
                        System.out.print("and twenty");
                        break;
                    case 3:
                        System.out.print("and thirty");
                        break;
                    case 4:
                        System.out.print("and forty");
                        break;
                    case 5:
                        System.out.print("and fifty");
                        break;
                    case 6:
                        System.out.print("and sixty");
                        break;
                    case 7:
                        System.out.print("and seventy");
                        break;
                    case 8:
                        System.out.print("and eighty");
                        break;
                    case 9:
                        System.out.print("and ninety");
                        break;
                }
                switch (unit){
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }

        } else {
            System.out.println("out of ability");
        }
    }
}
