package ss11_stack_and_queue.bai_tap;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    private static boolean checkPalindrome(String string){
        string = string.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> characters = new LinkedList<>();

        for (int i = string.length()-1; i >= 0 ; i--) {
            characters.add(string.charAt(i));
            stack.push(string.charAt(i));
        }


        boolean result = false;
        while (!characters.isEmpty()){
           if (stack.pop() == characters.poll()){
               result = true;
           }else {
               result = false;
               break;
           }
        }

        return result;
    }

    public static void main(String[] args) {
        String string = "LOL";
        System.out.println(checkPalindrome(string));
    }




}
