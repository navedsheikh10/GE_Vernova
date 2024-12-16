import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int limit, result = 1;

        // Prompt user for input
        System.out.print("Enter a number: ");
        limit = input.nextInt();

        // Validate the input
        if (limit > 31) {
            System.out.println("The number must be 31 or less.");
            return;
        }

        // Calculate and display powers of 2
        System.out.println("Powers of 2 up to " + limit + ":");
        for (int i = 0; i <= limit; i++) {
            System.out.println(result);
            result *= 2;
        }
    }
}
