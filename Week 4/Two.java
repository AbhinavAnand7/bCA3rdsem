
/* Question: Write a Java program to find the largest number among the three numbers. */
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();
            System.out.print("Enter third number: ");
            double num3 = scan.nextDouble();
            double largest;
            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
            System.out.println("The largest number is: " + largest);
        }
    }
}
