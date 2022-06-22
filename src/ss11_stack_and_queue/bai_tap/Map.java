package ss11_stack_and_queue.bai_tap;

import java.util.*;


public class Map {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        System.out.println("nhập vào một chuỗi ký tự");
        String myString = scanner.nextLine();

        String[] arrStr = myString.toLowerCase().split(" ");

        System.out.println(Arrays.toString(arrStr));

        //duyệt qua mảng string, đẩy key vào map
        for (int i = 0; i < arrStr.length; i++) {
            if (!arrStr[i].equals("")){
                if (treeMap.containsKey(arrStr[i])) {
                    treeMap.put(arrStr[i], treeMap.get(arrStr[i]) + 1);
                } else {
                    treeMap.put(arrStr[i], 1);
                }
            }
        }

        System.out.println(treeMap);


    }
}
