/*Question: Write a Java program and compute the sum of the digits of an integer. */
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            num = scan.nextInt();
        }
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;            
            temp /= 10;      
        }
        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}
