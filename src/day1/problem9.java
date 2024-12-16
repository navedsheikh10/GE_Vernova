package day1;

import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        // Convert to lowercase for easier checking
        character = Character.toLowerCase(character);

        // Check if the character is a letter
        if (character >= 'a' && character <= 'z') {
            // Check if the character is a vowel
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println(character + " is a vowel.");
            } else {
                System.out.println(character + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }

        input.close();
    }
}
