package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter usd");
        int usd = Integer.parseInt(scanner.nextLine());

        if (usd >= 0){
            int rate = 23000000;

            int vnd = usd * rate;
            System.out.println(usd + " usd = " + vnd + " vnd");
        }else {
            System.out.println("false");
        }
    }
}
