/*Question: Write a Java program to find the largest element in a given integer array*/
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        int size;
        int[] array;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            size = scan.nextInt();
            array = new int[size];
            System.out.print("Enter elments (space - separated): ");
            for (int i = 0; i < size; i++) 
                array[i] = scan.nextInt();
        }
        int largest = array[0];
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > largest)
                largest = array[i];
        }
        System.out.println("\nLargest element: " + largest);
    }
}
