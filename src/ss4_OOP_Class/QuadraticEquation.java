package ss4_OOP_Class;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
           return Math.pow(this.b,2) - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return - this.b + Math.sqrt(getDiscriminant())/2 * this.a;
    }
    public double getRoot2(){
        return - this.b - Math.sqrt(getDiscriminant())/2 * this.a;
    }
    public void display(){
        if (getDiscriminant() > 0){
            System.out.println("phương trình có 2 nghiệm x1 = " + getRoot1() + " x2 = " + getRoot2());
        }else if (getDiscriminant() == 0){
            System.out.println("phương trình có nghiệm kép x1 = x2 = " + getRoot1());
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
