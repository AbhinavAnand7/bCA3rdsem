/*Question: Write a Java program to calculate the factorial of a number. */
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            n = scan.nextInt();
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) 
            fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
