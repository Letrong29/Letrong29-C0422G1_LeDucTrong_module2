package ss14_thuat_toan_sap_xep.bai_tap;

public class MethodInsertionSort {
    public static void insertionSort(int[] myList){

        for (int i = 0; i < myList.length; i++) {
            int temp = myList[i];
            int index = i;

            while (index > 0 && temp < myList[index-1]){

                myList[index] = myList[index-1];
                index--;
            }
            myList[index] = temp;
        }
    }
}
