/*Question: Write a Java program to swap two numbers using a temporary variable. */
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number (a): ");
            int a = scan.nextInt();
            System.out.print("Enter second number (b): ");
            int b = scan.nextInt();
            
            System.out.printf("Before swapping: a = %d, b = %d\n", a, b);
            
            // Swapping with temp
            int temp = a;
            a = b;
            b = temp;
            
            System.out.printf("After swapping:  a = %d, b = %d\n", a, b);
        }
    }
}

