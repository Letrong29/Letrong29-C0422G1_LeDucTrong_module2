package ss5_access_modifier_statisc_method_property.bai_tap;

import java.net.CacheRequest;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("bán kính hình tròn " +  circle.getRadius() );
        System.out.println("diện tích hình tròn " + circle.getArea());

        Circle circle1 = new Circle(5);

        System.out.println(circle1.getRadius());
    }
}
