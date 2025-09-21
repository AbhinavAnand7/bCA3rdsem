
/*Question: Write a Java program to calculate the sum of following series:
1 + 2 + 3 + 4 + .......... + N
 */
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            int N = scan.nextInt();

            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            // int sum = (N*(N+1))/2;

            System.out.println("The sum of the series 1 + 2 + ... + " + N + " is: " + sum);
        }
    }
}
