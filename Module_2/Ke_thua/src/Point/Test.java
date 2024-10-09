package Point;

public class Test {

    public static void main(String[] args) {
        Point2D point1 = new Point2D(10,20);
        System.out.println("Thông tin của Point2D: " + point1.toString());
        Point3D point2 = new Point3D(10,20,30);
        point2.setXYZ(10,20,30);
        System.out.println("Thông tin của Point3D: " + point2.toString());
    }


}
