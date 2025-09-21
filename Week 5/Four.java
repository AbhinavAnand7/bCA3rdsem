/*Question: Write a java program to find the sum of following series where n is input by the user. 1+1/2+1/3+1/4+...............+1/n. */
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of terms (n): ");
            n = scan.nextInt();
        }   
        double sum = 0.0;
        for(int i = 1; i <= n; i++)
            sum += 1.0/i;
        System.out.printf("Sum of series: %.4f", sum);
    }
}
