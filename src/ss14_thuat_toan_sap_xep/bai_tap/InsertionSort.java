package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    static int[] myList = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSort(int[] myList){

        for (int i = 0; i < myList.length; i++) {
            int temp = myList[i];
            int index = i;
            System.out.println("số hiện tại là " + temp + " có index = " + index);

            while (index > 0 && temp < myList[index-1]){
                System.out.println("thỏa đk index = " + index + " > " + 0);
                System.out.println("thỏa đk số phía trước là " + myList[index -1 ] + " > hơn " + "số hiện tại là " + temp );

                myList[index] = myList[index-1];
                System.out.println("đẩy số " + myList[index -1] + " ra sau");
                System.out.println("gán số hiện tại " + temp + " cho vị trí của số " + myList[index -1 ]+ " có index " + index);
                index--;
                System.out.println("giảm index còn " + index);
            }
            if (index == 0){
                System.out.println("không thỏa đk index > 0");
                System.out.println("giữ nguyên vị trí của số " + temp + " tại vị trí " + index);
            }else{
                System.out.println("không thỏa đk số trước = " + myList[index-1] + " > " + "số hiện tại = " + temp);
                System.out.println("giữ nguyên vị trí của số " + temp + " tại vị trí " + index);
            }

            myList[index] = temp;
        }
    }

    public static void main(String[] args) {
        insertionSort(myList);
        System.out.println(Arrays.toString(myList));
    }


}
