package ss4_OOP_Class;

public class TestRun {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1.0,3,1);

        System.out.println(quadraticEquation.getA());
        System.out.println(quadraticEquation.getB());
        System.out.println(quadraticEquation.getC());

        quadraticEquation.setA(1);
        quadraticEquation.setB(2);
        quadraticEquation.setC(3);

        System.out.println(quadraticEquation.getA());
        System.out.println(quadraticEquation.getB());
        System.out.println(quadraticEquation.getC());

        quadraticEquation.display();
    }

}
