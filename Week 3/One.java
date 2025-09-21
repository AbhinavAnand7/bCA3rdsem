/* Question 
Write a java program to add the two numbers.
*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nEnter first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();
            double result = num1 + num2;
            System.out.printf("Addition result of %.2f and %.2f is: %.2f\n", num1, num2, result);
        }
    }
}
