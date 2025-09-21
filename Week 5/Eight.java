/*Question: Write a Java program to reverse the digits of a given integer. */
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            num = scan.nextInt();
        }
        int reversed = 0;
        int temp = num;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
