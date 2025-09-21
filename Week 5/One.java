/*Question: Write a Java program to insert 10, 20, 30 ....in an array and display them. */
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = scan.nextInt();
            int[] array = new int[size];
            System.out.print("Enter elments (space - separated): ");
            for (int i = 0; i < size; i++) 
                array[i] = scan.nextInt();
            System.out.print("Array: ");
            for (int i = 0; i < size; i++) 
                System.out.print(array[i] + " ");
        }
    }
}