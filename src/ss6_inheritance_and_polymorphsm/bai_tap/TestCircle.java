package ss6_inheritance_and_polymorphsm.bai_tap;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0,"red");

        System.out.println(circle1.toString());

        System.out.println("diện tích hình tròn là " + circle1.getArea());

    }
}
