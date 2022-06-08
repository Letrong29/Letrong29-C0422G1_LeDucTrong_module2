package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        byte num;
        do {
            System.out.println("menu");
            System.out.println("1. Cafe");
            System.out.println("2. Siting");
            System.out.println("3. nước suối");
            System.out.println("0. thoát chọn món");
            System.out.println("nhập món bạn muốn uống");
            num = Byte.parseByte(scanner.nextLine());

            switch (num){
                case 1:
                    System.out.println("bạn chọn cafe");
                    break;
                case 2:
                    System.out.println("bạn chọn Siting");
                    break;
                case 3:
                    System.out.println("bạn chọn nước suối");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("bạn chưa chọn món");
                }
            }while (num != 0);

    }
}
