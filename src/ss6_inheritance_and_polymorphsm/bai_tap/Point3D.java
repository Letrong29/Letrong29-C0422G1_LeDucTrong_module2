package ss6_inheritance_and_polymorphsm.bai_tap;

public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arrayXYZ = {getX(),getY(),getZ()};
        return arrayXYZ;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                ", x = " + getXYZ()[0] +
                ", y = " + getXYZ()[1] +
                ", z = " + getXYZ()[2] +
                '}';
    }
}
