package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class SelectionSort {
    static double[] myList = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] myList) {
        for (int i = 0; i < myList.length; i++) {

            double min = myList[i];
            boolean check = false;

            for (int j = i + 1; j < myList.length; j++) {
                if (min > myList[j]){
                    min = myList[j];
                    check = true;
                }
            }

            if (check){
                double temp = min;
                min = myList[i];
                myList[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(myList));
        selectionSort(myList);
        System.out.println(Arrays.toString(myList));
    }
}
