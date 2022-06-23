package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {

        boolean checkArr = true;

        for (int i = 0; i < list.length && checkArr; i++) {

            checkArr = false;

            for (int j = list.length - 1; j > i; j--) {

                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;

                    checkArr = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
