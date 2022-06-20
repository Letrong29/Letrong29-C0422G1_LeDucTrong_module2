package ss11_stack_and_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    //method reverse Array Interger
    public static int[] reverseArr(int[] arr){

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        int newSize = arr.length;
        int[] newArr = new int[newSize];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = stack.pop();
        }

        return newArr;
    }

    //method reverse String
    public static String reverseStr(String str){

        String[] arStr = str.split(" ");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arStr.length; i++) {
            stack.push(arStr[i]);
        }

        String newStr = "";

        for (int i = 0; i < arStr.length; i++) {
            newStr += stack.pop() + " ";
        }

        return newStr;
    }


    //hàm kiểm thử
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("mảng trước khi đảo");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("mảng sau khi đảo");
        for (int i = 0; i < reverseArr(arr).length; i++) {
            System.out.println(reverseArr(arr)[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chuỗ bất kỳ");
        String str = scanner.nextLine();

        System.out.println("chuỗi trước khi đảo");
        System.out.println(str);

        System.out.println("chuỗi sau khi dảo");
        System.out.println(Reverse.reverseStr(str));
    }

}
