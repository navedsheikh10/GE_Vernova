import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of flips
        System.out.println("How many times would you like to toss the coin? ");

        // Read the user's input
        int totalFlips = input.nextInt();

        // Initialize counters and percentages
        int countHeads = 0, countTails = 0;
        double percentageHeads, percentageTails;

        // Simulate the coin flips
        for (int toss = 1; toss <= totalFlips; toss++) {
            if (Math.random() < 0.5) {
                countTails++;
            } else {
                countHeads++;
            }
        }

        // Calculate the percentages
        percentageHeads = (countHeads * 100.0) / totalFlips;
        percentageTails = (countTails * 100.0) / totalFlips;

        // Display the results
        System.out.println("Heads appeared in " + percentageHeads + "% of the tosses.");
        System.out.println("Tails appeared in " + percentageTails + "% of the tosses.");
    }
}
