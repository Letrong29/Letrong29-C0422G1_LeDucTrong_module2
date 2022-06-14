package ss5_access_modifier_statisc_method_property.bai_tap;

public class Circle {

    private String color = "red";
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }
}
