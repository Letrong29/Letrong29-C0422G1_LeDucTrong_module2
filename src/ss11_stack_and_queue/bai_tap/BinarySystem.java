package ss11_stack_and_queue.bai_tap;

import java.util.Stack;

public class BinarySystem {

    //method chuyển đổi 1 số sang hệ nhịn phân
    public static String convert(int num) { //truyền vào 1 số và trả về 1 chuỗi

        Stack<Integer> myStack = new Stack<>();

        do {
            int element = num % 2;
            myStack.push(element);
            num = num/2;
        }while (num > 0);


        String result ="";
        while (!myStack.isEmpty()){
            result += myStack.pop();
        }

        return result;

    }

    //hàm test
    public static void main(String[] args) {
        System.out.println(BinarySystem.convert(8));
    }
}
