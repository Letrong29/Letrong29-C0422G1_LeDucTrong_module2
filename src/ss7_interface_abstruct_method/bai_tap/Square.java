package ss7_interface_abstruct_method.bai_tap;

public class Square extends Rectangle implements Resizeable, Colorable {

    public Square(double size) {
        super(size, size);
    }

    public Square() {
    }

    public double getSize(){
        return getWidth();
    }

    public void setSize(double size){
        setWidth(size);
        setLongs(size);
    }


    @Override
    public String toString() {
        return "Square{" +
                " size = " + getSize() +
                ", width=" + width +
                ", longs=" + longs +
                ", area: " + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        double area = getSize() * getSize();
        return area;
    }

    @Override
    public void resize(double percent) {
        setSize(percent*getSize()/100);
    }

    @Override
    public void howToColor() {

    }
}
