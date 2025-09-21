/*Question: Write a Java program to check whether a given character is a vowel or
consonant. */
import java.util.Scanner;
public class Six {
        public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = scan.next().charAt(0);  // get the first character of input
            ch = Character.toLowerCase(ch);
            if (!Character.isLetter(ch)) {
                System.out.println("Invalid input. Please enter an alphabet character.");
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is Vowel");
            } else {
                System.out.println(ch + " is Consonant");
            }
        }
    }
}
