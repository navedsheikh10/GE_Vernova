package day1;

import java.util.Scanner;
public class problem5 {
    // Initialize the Variables
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to find its prime factors: ");
        int number = input.nextInt();

        // Display prime factors
        System.out.println("The prime factors of " + number + " are:");

        int divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
                number /= divisor;
            } else {
                divisor++;
            }
        }
    }
}
