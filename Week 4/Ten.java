/*Question: Write a Java program that takes a number as input and prints all its factors. */
import java.util.Scanner;
public class Ten {
        public static void main(String[] args) {

            try (Scanner scan = new Scanner(System.in)) {

                System.out.print("Enter a number: ");
                int number = scan.nextInt();
                
                System.out.println("Factors of " + number + " are:");

                for (int i = 1; i <= number; i++) {

                    if (number % i == 0) {
                        System.out.println(i);
                    }
                }   }
    }
}
