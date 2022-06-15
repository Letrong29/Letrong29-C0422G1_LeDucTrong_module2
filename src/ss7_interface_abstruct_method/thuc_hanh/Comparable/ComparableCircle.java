package ss7_interface_abstruct_method.thuc_hanh.Comparable;

import ss6_inheritance_and_polymorphsm.bai_tap.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    //contructor của ComparableCircle
    public ComparableCircle() {

    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()){
            return 1;
        }else if (getRadius()<o.getRadius()){
            return -1;
        }else {
            return 1;
        }
    }
}
