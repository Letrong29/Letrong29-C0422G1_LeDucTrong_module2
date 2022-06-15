package ss7_interface_abstruct_method.bai_tap;


import ss6_inheritance_and_polymorphsm.bai_tap.Circle;
import ss6_inheritance_and_polymorphsm.thuc_hanh.Shape;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("red",false,10);
        shapes[1] = new Rectangle("blue",false,5, 10);
        shapes[2] = new Square(15);


        System.out.println("diện tích các hình trước khi đổi size");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }


        for (Shape shape: shapes) {
            if (shape instanceof Circle){
                ((Circle)shape).resize(Math.random()*100);
            }else if (shape instanceof Rectangle){
                ((Rectangle)shape).resize(Math.random()*100);
            }else {
                ((Square)shape).resize(Math.random()*100);
            }
        }

        System.out.println("diện tích các hình sau khi đổi size ");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }



}
}
