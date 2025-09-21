
/* Question: Write a java program to print the following pattern: 
  *
 **
***
 **
  *
*/
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of total number of rows (must be odd): ");
            int h = sc.nextInt();
            int mid = (h + 1) / 2;
            for (int i = 1; i <= h; i++) {
                int stars = (i <= mid) ? i : h - i + 1;
                int spaces = mid - stars;
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
