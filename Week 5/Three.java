/*Question: Write a java program to print the following pattern.
 1
 12
 123
 1234
 12345 */
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of rows (n): ");
            n = scan.nextInt();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }   
}
