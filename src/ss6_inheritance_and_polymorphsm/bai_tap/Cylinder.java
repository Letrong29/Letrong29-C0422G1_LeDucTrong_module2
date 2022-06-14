package ss6_inheritance_and_polymorphsm.bai_tap;

public class Cylinder extends Circle{ //Thiết kế và triển khai lớp Cylinder là con của lớp Circle
    double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return  Math.PI  * Math.pow(getrRadius(),2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius = " + getrRadius() +
                " color = " + getColor() +
                " height=" + height +
                '}';
    }
}
