package ss15_xu_li_ngoai_le_and_debug.bai_tap;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalTriangleException("tam giác không hợp lệ");
        }else {
            System.out.println("tam giác hợp lệ");
        }
    }

}
