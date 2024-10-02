import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("--------Menu--------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F:");
                    double fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit + " bằng: " + convertFtoC(fahrenheit) + " độ C");
                    break;

                case 2:
                    System.out.println("Nhập độ C: ");
                    double celsius = sc.nextDouble();
                    System.out.println(celsius + " bằng: " + convertCtoF(celsius) + " độ F");
                    break;
            }
        } while (choice != 0);


    }

    //Method chuyển độ C sang F:
    public static double convertCtoF(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    //Method chuyển độ F sang C:
    public static double convertFtoC(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

}
