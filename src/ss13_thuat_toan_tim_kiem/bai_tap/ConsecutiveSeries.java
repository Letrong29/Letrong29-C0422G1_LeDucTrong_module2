package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        System.out.println("nhập chuỗi: ");
        String myString = scanner.nextLine();

        for (int i = 0; i < myString.length(); i++) {
            if (list.size() > 1 && myString.charAt(i) <= list.getLast()){
                list.clear();
            }

            list.add(myString.charAt(i));

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for (Character c: max){
            System.out.println(c);
        }

    }



}
