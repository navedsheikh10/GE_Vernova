import java.util.Scanner;
public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Swap the numbers
        // Step 1 - store the value of the first number in a temporary variable
        int temp = num1;
        // Step 2 - assign the value of the second number to the first number
        num1 = num2;
        // Step 3 - assign the value of the first number to the second number using the temporary variable
        num2 = temp;

        // Output the swapped numbers
        System.out.println("The numbers have been swapped.");
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
    }
}
