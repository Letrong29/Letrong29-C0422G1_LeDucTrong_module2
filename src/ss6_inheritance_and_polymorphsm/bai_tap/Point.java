package ss6_inheritance_and_polymorphsm.bai_tap;

public class Point {
    // tạo lớp point với 2 thuộc tính x,y
    private float x = 0.0f;
    private float y = 0.0f;

    //tạo contructor full tham số

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //tạo contructor ko tham số
    public Point() {

    }

    //tạo các pt getter setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    //phướng thức setXY, cho phép người dùng xét X và Y cùng lúc
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //phương thức getXY return về một mảng 2 phần tử X và Y
    public float[] getXY() {
        float[] myXY = {x, y};
        return myXY;
    }

    //phương thức toString cho phép hiển thị các phần tử của mảng getXY
    @Override
    public String toString() {
        return "Point{" +
                "x = " + getXY()[0] +
                ", y = " + getXY()[1] +
                '}';
    }
}
