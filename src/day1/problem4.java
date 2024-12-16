package day1;

import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        // Initialize variables
        double harmonicSum = 0.0;
        int totalTerms;
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of terms in the harmonic series: ");
        totalTerms = input.nextInt();

        // Calculate the harmonic value
        for (int term = 1; term <= totalTerms; term++) {
            harmonicSum += 1.0 / term;
        }

        // Display the result
        System.out.println("The harmonic value for " + totalTerms + " terms is: " + harmonicSum);
    }
}
