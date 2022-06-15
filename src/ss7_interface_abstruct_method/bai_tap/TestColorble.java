package ss7_interface_abstruct_method.bai_tap;

import ss6_inheritance_and_polymorphsm.bai_tap.Circle;
import ss6_inheritance_and_polymorphsm.thuc_hanh.Shape;

public class TestColorble {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(15);
        shapes[1] = new Rectangle(15,20);
        shapes[2] = new Square(30);

        for(Shape shape: shapes){
            if (shape instanceof Square){
                ((Square)shape).howToColor();
            }
        }
    }
}
