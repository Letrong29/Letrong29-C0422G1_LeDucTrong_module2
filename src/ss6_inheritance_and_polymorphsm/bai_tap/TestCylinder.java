package ss6_inheritance_and_polymorphsm.bai_tap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(5.0,"blue", 5.0);

        System.out.println(cylinder1.toString());

        System.out.println("thể thích hình trị là " + cylinder1.getVolume());
        System.out.println("diện tích mặt đáy là " + cylinder1.getArea());

    }
}
