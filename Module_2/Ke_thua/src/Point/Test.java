package Point;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        System.out.println("Point : " + p1.toString());

        MovablePoint p2 = new MovablePoint(5,6,7,8);

        System.out.println("MovablePoint :" + p2.toString());


    }
}
