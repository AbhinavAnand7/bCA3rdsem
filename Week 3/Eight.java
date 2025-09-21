/*Question Write a Java program to convert temperature from Celsius to Fahrenheit */
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Select the unit you want to convert FROM:");
            System.out.println(" 1. Celsius (C or c)");
            System.out.println(" 2. Fahrenheit (F or f)");
            System.out.print("Enter your choice (1/C or 2/F): ");
            String input = scan.next().toLowerCase();
            switch (input) {
                case "1", "c" -> {
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scan.nextDouble();
                    double fahrenheit = (celsius * 9.0 / 5) + 32;
                    System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
                }
                case "2", "f" -> {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scan.nextDouble();
                    double celsius = (fahrenheit - 32) * 5.0 / 9;
                    System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);
                }
                default -> System.out.println(" Invalid input. Please enter 1, 2, C, or F.");
            }
        }
    }
}
