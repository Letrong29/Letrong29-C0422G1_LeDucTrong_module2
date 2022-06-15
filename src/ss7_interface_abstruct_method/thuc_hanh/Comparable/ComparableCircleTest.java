package ss7_interface_abstruct_method.thuc_hanh.Comparable;

import ss6_inheritance_and_polymorphsm.bai_tap.Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle[] circles = new ComparableCircle[3];

        circles[0] = new ComparableCircle("red",true,5);
        circles[1] = new ComparableCircle("blue", true, 10);
        circles[2] = new ComparableCircle();

        System.out.println("trước khi sắp xếp");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("sau khi sắp xếp");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
