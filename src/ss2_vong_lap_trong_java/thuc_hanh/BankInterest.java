package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhập số tiền gửi");
        double money = Double.parseDouble(input.nextLine());

        System.out.println("nhập số tháng gửi");
        int month = Integer.parseInt(input.nextLine());

        System.out.println("nhập tỉ lệ lãi xuất");
        double interestRate = Double.parseDouble(input.nextLine());

        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest +=  money * (interestRate/100)/12 * month;
        }
        System.out.println("tổng tiền lãi là " + totalInterest);
    }
}
