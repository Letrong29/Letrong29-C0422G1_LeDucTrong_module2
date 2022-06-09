package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        //tạo menu cho ng dùng chọn

        int yourChoice;
        do {
            System.out.println("your choice");
            yourChoice = Integer.parseInt(scanner.nextLine());
            switch (yourChoice){
                case 1:
                    System.out.println("Enter Fahrenheit");
                    double doF = Double.parseDouble(scanner.nextLine());
                    System.out.println(doF + " độ F " + " = " + FahrenheittoCelsius(doF) + " độ C");
                    break;
                    //gọi hàm FahrenheittoCelsius
                case 2:
                    System.out.println("Enter Celsius");
                    double doC = Double.parseDouble(scanner.nextLine());
                    System.out.println(doC + " độ C " + " = " + CelsiustoFahrenheit(doC) + " độ F");
                    break;
                    //gọi hàm CelsiustoFahrenheit
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not selected yet");
                    break;
            }
            // dùng switchCase sử lý lựa chộn của ng dùng
        }while (yourChoice != 0);
        //dùng do cho ng dùng nhập lại liên tục nếu ko chọn Exit



    }
    public static double FahrenheittoCelsius (double f){
        double c = (f - 32)/1.8;
        return c;
    }
    //tạo hàm FahrenheittoCelsius để đổi độ F sang C
    public static double CelsiustoFahrenheit (double c){
        double f = c * 1.8 + 32;
        return f;
    }
    //tạo hàm CelsiustoFahrenheit để đổi độ C sang F

}
