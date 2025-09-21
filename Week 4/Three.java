
/*Question: Write a Java program that takes a number as input and prints its
multiplication table upto 10. */
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            
            System.out.println("Multiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
