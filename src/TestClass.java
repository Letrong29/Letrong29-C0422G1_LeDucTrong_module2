import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] a ={1,2,2,3,4};
        for (int i = a.length-1; i > 1; i--) {
            a[i] = a[i-1];
        }a[1] = 6;
        System.out.println(Arrays.toString(a));
    }
}
