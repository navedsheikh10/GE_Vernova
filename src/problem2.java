import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputYear;
        int numericYear;

        // Prompt the user to enter a year
        System.out.print("Please enter a year: ");
        inputYear = input.next();

        // Validate the length of the year
        if (inputYear.length() != 4) {
            System.out.println("Invalid input. Please provide a 4-digit year.");
            return;
        }

        // Convert the string to an integer
        numericYear = Integer.parseInt(inputYear);

        // Determine if the year is a leap year
        if ((numericYear % 400 == 0) || (numericYear % 4 == 0 && numericYear % 100 != 0)) {
            System.out.println("The year " + numericYear + " is a leap year.");
        } else {
            System.out.println("The year " + numericYear + " is not a leap year.");
        }
    }
}
