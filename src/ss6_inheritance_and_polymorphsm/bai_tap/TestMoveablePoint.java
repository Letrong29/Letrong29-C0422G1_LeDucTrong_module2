package ss6_inheritance_and_polymorphsm.bai_tap;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint(1f,2f );

        System.out.println(moveablePoint1.toString());

        moveablePoint1.move();

        System.out.println(moveablePoint1.toString());
    }
}
