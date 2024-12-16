import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        input.close();
    }
}
