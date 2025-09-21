
/*Question: Write a Java program to find the smallest number among four given numbers.
 */
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            System.out.print("Enter third number: ");
            double num3 = scan.nextDouble();

            System.out.print("Enter fourth number: ");
            double num4 = scan.nextDouble();

            // double smallest = Math.min(Math.min(a, b), Math.min(c, d));
            
            double smallest;
            
            if (num1 < num2 && num1 < num3 && num1 < num4) {
                smallest = num1;
            } else if (num2 < num3 && num2 < num4) {
                smallest = num2;
            } else if (num3 < num4) {
                smallest = num3;
            } else {
                smallest = num4;
            }

            System.out.printf("The smallest number is: %.2f", smallest);
        }
    }
}
