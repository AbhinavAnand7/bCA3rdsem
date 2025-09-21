/*Question: Write a Java program to convert a decimal number into Hexadecimal number and vice-versa. */
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        System.out.println("Select one operation: ");
        System.out.println("1. Decimal to Hexadecimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.print("Enter your choice (1-2): ");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("\nEnter the number (decimal): ");
                int num = sc.nextInt();
                String hexStr = "";
                if (num == 0)
                    hexStr = "0";
                else {
                    while (num > 0) {
                        hexStr = switch (num % 16) {
                            case 10 -> "A" + hexStr;
                            case 11 -> "B" + hexStr;
                            case 12 -> "C" + hexStr;
                            case 13 -> "D" + hexStr;
                            case 14 -> "E" + hexStr;
                            case 15 -> "F" + hexStr;
                            default -> (num % 16) + hexStr;
                        };
                        num /= 16;
                    }
                }
                System.out.println("Hexadecimal: " + hexStr);
            }
            case 2 -> {
                System.out.print("\nEnter the number (hexdecimal): ");
                String hex = sc.next();
                int decimal = 0;
                int power = 0;
                for (int i = hex.length() - 1; i >= 0; i--) {
                    char c = hex.charAt(i);
                    int value = 0;
                    if (c >= '0' && c <= '9')
                        value = c - '0';
                    else if (c >= 'A' && c <= 'F')
                        value = c - 'A' + 10;
                    else if (c >= 'a' && c <= 'f')
                        value = c - 'a' + 10;

                    decimal += value * Math.pow(16, power);
                    power++;
                }
                System.out.println("Decimal: " + decimal);

            }
            default -> System.out.println("Invalid choice! Please run again.");
        }
        sc.close();
    }
}
