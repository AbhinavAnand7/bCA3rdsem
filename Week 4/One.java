/* Question: Write a Java program to check whether the given number is odd or even */
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double number = scan.nextDouble();

            if (number % 1 != 0) {
                System.out.println("The number is not an integer, so it cannot be even or odd.");
            } else {
                int num = (int) number;
                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
            }
        }
    }
}

