package day3;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] playerPositions = {0, 0}; // Initial positions of Player 1 and Player 2
        int activePlayer = 0; // Index to track the current player (0 for Player 1, 1 for Player 2)

        // Game continues until one player reaches or exceeds position 100
        while (playerPositions[0] < 100 && playerPositions[1] < 100) {
            int diceRoll = randomGenerator.nextInt(6) + 1; // Roll the dice (1 to 6)
            int event = randomGenerator.nextInt(3); // Randomly determine event: 0 = No Play, 1 = Ladder, 2 = Snake

            // Check if the player can move without exceeding position 100
            if (playerPositions[activePlayer] + diceRoll <= 100) {
                switch (event) {
                    case 0: // No Play: Player remains at the same position
                        System.out.println("Player " + (activePlayer + 1) + " rolls a " + diceRoll + " but stays at position " + playerPositions[activePlayer]);
                        break;

                    case 1: // Ladder: Player advances by the dice value
                        playerPositions[activePlayer] += diceRoll;
                        System.out.println("Player " + (activePlayer + 1) + " climbs a Ladder to position " + playerPositions[activePlayer]);
                        continue; // Player gets another turn due to the ladder

                    case 2: // Snake: Player retreats by the dice value but not below position 0
                        playerPositions[activePlayer] -= diceRoll;
                        playerPositions[activePlayer] = Math.max(playerPositions[activePlayer], 0);
                        System.out.println("Player " + (activePlayer + 1) + " encounters a Snake and slides to position " + playerPositions[activePlayer]);
                        break;
                }
            } else {
                System.out.println("Player " + (activePlayer + 1) + " rolls a " + diceRoll + " but stays at position " + playerPositions[activePlayer]);
            }

            // Display the current position of the player
            System.out.println("Player " + (activePlayer + 1) + " is now at position " + playerPositions[activePlayer]);

            // Switch turn to the other player
            activePlayer = 1 - activePlayer;
        }

        // Announce the winner
        int winner = (playerPositions[0] >= 100) ? 1 : 2;
        System.out.println("Player " + winner + " wins the game!");
    }
}

