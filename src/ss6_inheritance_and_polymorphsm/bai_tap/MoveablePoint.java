package ss6_inheritance_and_polymorphsm.bai_tap;

public class MoveablePoint extends Point {

    //tạo lớp con MoveablePoint kế thừa lớp cha Point
    //và có thêm 2 thuộc tính xSpeed, ySpeed
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //tạo contructor full tham số
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //tạo contructor chỉ có 2 tham số của lớp con MoveablePoint
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //tạo contructor ko tham số của lớp con MoveablePoint
    public MoveablePoint() {

    }

    //tạo các pt getter và setter 2 thuộc tính của lớp con MoveablePoint
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //tạo pt setSpeed để có thể cùng lúc set lại xSpeed và ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //tạo pt getSpeed return về 1 mảng có kiểu dữ liệu trả về là float, chưa 2 phần tử xSpeed và ySpeed
    public float[] getSpeed() {
        float[] arrGetSpeed = {xSpeed, ySpeed};
        return arrGetSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint = " + "(" +
                "x = " + getX() +
                ", y = " + getY() + ")" +
                "Speed = (" + "xSpeed = " + getxSpeed() +
                ", ySpeed = " + getySpeed() +
                ')';
    }

    public MoveablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }




}
