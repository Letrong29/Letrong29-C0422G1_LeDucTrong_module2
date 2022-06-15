package ss7_interface_abstruct_method.thuc_hanh.Comparable;

import ss6_inheritance_and_polymorphsm.bai_tap.Circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {

        Circle[] circles = new Circle[3];

        circles[0] = new Circle(1);
        circles[1] = new Circle();
        circles[2] = new Circle(2);

        System.out.println("trước khi sắp xếp");
        for (Circle circle :circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("sau khi sắp xếp");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
    }
}
