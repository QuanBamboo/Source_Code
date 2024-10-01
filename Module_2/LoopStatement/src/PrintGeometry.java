import java.util.Scanner;

public class PrintGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập lựa chọn hình: ");
            System.out.println("1. Print Rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            byte choice = sc.nextByte();
            if (choice == 4) {
                break;
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("Nhâp chiều dài: ");
                        int width = sc.nextInt();
                        System.out.println("Nhập chiều cao: ");
                        int height = sc.nextInt();

                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print("\t*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println(" Chọn vị trí góc vuông: ");
                        System.out.println("1. bottom-left");
                        System.out.println("2. top-left");
                        byte choice2 = sc.nextByte();
                        switch (choice2) {
                            case 1:
                                for (int i = 0; i <= 5; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("\t*");
                                    }
                                    System.out.println("");
                                }
                                break;

                            case 2:
                                for (int i = 7; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("\t*");
                                    }
                                    System.out.println("");
                                }
                                break;
                        }
                        break;
                    case 3:

                        break;

                }

            }
        }


    }
}
