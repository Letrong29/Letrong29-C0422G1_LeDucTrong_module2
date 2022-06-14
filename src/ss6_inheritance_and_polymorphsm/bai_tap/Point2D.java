package ss6_inheritance_and_polymorphsm.bai_tap;

public class Point2D {
    //thuộc tính
    private float x = 0.0f;
    private float y = 0.0f;

    //khởi tạo 2 contructor
    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

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

    public float[] getXY (){
        float[] arrayXY = {x, y};
        return arrayXY;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getXY()[0] +
                ", y=" + getXY()[1] +
                '}';
    }
}
