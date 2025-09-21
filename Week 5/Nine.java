/*Question: Write a Java program to check if a given number is a palindrome or not */
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            num = scan.nextInt();
        }
        int reversed = 0;
        int temp = num;
        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        if (num == reversed)
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }
}
