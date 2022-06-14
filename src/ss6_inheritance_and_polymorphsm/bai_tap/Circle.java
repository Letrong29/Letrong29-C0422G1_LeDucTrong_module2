package ss6_inheritance_and_polymorphsm.bai_tap;



public class Circle { //Thiết kế lớp Circle (hình tròn)
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getrRadius() {
        return radius;
    }

    public void setDarius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }
    public String toString(){
        return "Circle { radius = " + radius +
                " color = " + color + " }";
    }
}
