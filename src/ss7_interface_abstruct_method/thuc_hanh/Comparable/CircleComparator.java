package ss7_interface_abstruct_method.thuc_hanh.Comparable;

import ss6_inheritance_and_polymorphsm.bai_tap.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() < o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() > o2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
