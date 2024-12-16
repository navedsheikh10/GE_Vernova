import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output the results
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

        input.close();
    }
}
