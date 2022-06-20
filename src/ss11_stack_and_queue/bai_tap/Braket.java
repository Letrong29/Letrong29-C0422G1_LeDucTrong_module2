package ss11_stack_and_queue.bai_tap;

import java.util.Stack;

public class Braket {

    public static boolean checkBraket(String str){

        Stack<Character> bStack = new Stack<>();

        boolean result;

        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '('){
                bStack.push(sym);
            }

            if (sym == ')'){
                if (bStack.isEmpty()){
                    return result = false;
                }else{
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";

        System.out.println(checkBraket(str));
    }


}

