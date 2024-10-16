package Tach_bien;

import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Fizz: ");
        int fizz = scanner.nextInt();
        System.out.println("Nhập Buzz: ");
        int buzz = scanner.nextInt();
        System.out.println("Kết quả là: " + FizzBuzz.fizzBuzz(fizz) + FizzBuzz.fizzBuzz(buzz));
    }
}
