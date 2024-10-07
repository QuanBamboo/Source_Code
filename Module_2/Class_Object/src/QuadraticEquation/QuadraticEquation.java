package QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getter & Setter:
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    //Tính delta:
    public double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }


    public double getRoot1() {
        if (getDelta() < 0) return 0;
        return (-b + Math.sqrt(getDelta())) / (2 * a);
    }

    public double getRoot2() {
        if (getDelta() < 0) return 0;
        return (-b - Math.sqrt(getDelta())) / (2 * a);
    }


}
