package Fan;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        //Fan1:
        System.out.println("-------Fan1--------");
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        //Fan2:
        System.out.println("-------Fan2--------");
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        System.out.println(fan2.toString());

    }
}
