package ss7_interface_abstruct_method.bai_tap;

import ss6_inheritance_and_polymorphsm.thuc_hanh.Shape;

public class Rectangle extends Shape implements Resizeable{
    double width = 1.0;
    double longs = 1.0;

    //contrucor
    public Rectangle(double width, double longs) {
        this.width = width;
        this.longs = longs;
    }

    public Rectangle(String color, boolean filled, double width, double longs) {
        super(color, filled);
        this.width = width;
        this.longs = longs;
    }

    public Rectangle() {

    }

    //get and set
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getArea(){
        double area = width * longs;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", longs=" + longs +
                ", area: " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(percent*getWidth()/100);
        setLongs(percent*getLongs()/100);
    }
}
