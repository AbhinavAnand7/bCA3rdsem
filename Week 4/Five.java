
/*Question: Write a Java program to take a number, divide it by 2 and print the result
until the number becomes less than 10 */
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            if(number < 10)
                System.out.println("Number is less than 10, please enter more than 10");
            while (number >= 10) {
                System.out.println(number + " / 2 = " + (number/2) );
                number = number / 2;
            }
        }
    }
}
