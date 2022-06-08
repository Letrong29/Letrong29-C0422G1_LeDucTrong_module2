package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class DisplayPicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. chữ nhật");
        System.out.println("2. tam giác vuông");
        System.out.println("3. tam giác cân");
        System.out.println("bạn muốn vẽ hình ?");
        byte chose = Byte.parseByte(scanner.nextLine());

        switch (chose){
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } 
            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 5; i >= 0 ; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            case 3:
                for (int i = 1; i <= 4 ; i++) {
                    for (int j = 1; j <= 4-i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2*i -1 ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

        }
    }
}
