package ss15_xu_li_ngoai_le_and_debug.bai_tap;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập các cạnh của tam giác");

        System.out.println("nhập cạnh thứ nhất");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập cạnh thứ hai");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập cạnh thứ ba");
        int c = Integer.parseInt(scanner.nextLine());

        Triangle myTriangle = new Triangle(a,b,c);


        try {
            myTriangle.checkTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }


        System.out.println("-----end-----");
    }
}
