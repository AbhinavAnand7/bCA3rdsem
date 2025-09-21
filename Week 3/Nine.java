/*Question: Write a Java program that takes two integer inputs and computes their remainder and quotient. */
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first number (dividend): ");
            int num1 = scan.nextInt();

            System.out.print("Enter the second number (divisor): ");
            int num2 = scan.nextInt();

            int quotient = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
