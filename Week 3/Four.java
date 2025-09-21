
/* Question: Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter three numbers (space-separated): ");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            double num3 = scan.nextDouble();
            
            double average = (num1 + num2 + num3) / 3;
            System.out.printf("Average of %.2f, %.2f and %.2f is: %.2f", num1, num2, num3, average);
        }
    }
}
