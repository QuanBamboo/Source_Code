import java.util.Scanner;

public class NumberChangeLetter {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("Bạn nhập số tào lao");

        } else {

            int hangTram = number / 100;
            int hangChuc = number - hangTram * 100;
            int hangDonvi = number - hangTram * 100 - (hangChuc / 10) * 10;
            String str1 = " hundred ";
            String str2 = "ty-";

            //In hàng trăm
            switch (hangTram) {
                case 1:
                    System.out.print("One" + str1);
                    break;
                case 2:
                    System.out.print("Two" + str1);
                    break;
                case 3:
                    System.out.print("Three" + str1);
                    break;
                case 4:
                    System.out.print("Four" + str1);
                    break;
                case 5:
                    System.out.print("Five" + str1);
                    break;
                case 6:
                    System.out.print("Six" + str1);
                    break;
                case 7:
                    System.out.print("Seven" + str1);
                    break;
                case 8:
                    System.out.print("Eight" + str1);
                    break;
                case 9:
                    System.out.print("Nine" + str1);
                    break;
            }

            //In hàng chục
            if (hangChuc >= 10 && hangChuc <= 20) {
                switch (hangChuc) {
                    case 10:
                        System.out.print("ten");
                        break;
                    case 11:
                        System.out.print("eleven");
                        break;
                    case 12:
                        System.out.print("twelve");
                        break;
                    case 13:
                        System.out.print("thirteen");
                        break;
                    case 14:
                        System.out.print("fourteen");
                        break;
                    case 15:
                        System.out.print("fifteen");
                        break;
                    case 16:
                        System.out.print("sixteen");
                        break;
                    case 17:
                        System.out.print("seventeen");
                        break;
                    case 18:
                        System.out.print("eighteen");
                        break;
                    case 19:
                        System.out.print("nineteen");
                        break;
                    case 20:
                        System.out.print("twenty");
                        break;
                }
            } else {
                switch (hangChuc / 10) {
                    case 3:
                        System.out.print("thirty" + str2);
                        break;
                    case 4:
                        System.out.print("four" + str2);
                        break;
                    case 5:
                        System.out.print("fif" + str2);
                        break;
                    case 6:
                        System.out.print("six" + str2);
                        break;
                    case 7:
                        System.out.print("seven" + str2);
                        break;
                    case 8:
                        System.out.print("eight" + str2);
                        break;
                    case 9:
                        System.out.print("nine" + str2);
                        break;
                }
            }
            //  In hàng đơn vị
            if (hangChuc / 10 != 1) {
                switch (hangDonvi) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }

        }
    }
}
