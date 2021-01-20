package tasks;

public class Task6030 {

	public static void main(String[] args) {
		// (Game: craps) Craps is a popular dice game played in casinos.
		// Write a program to play a variation of the game, as follows:
		// Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6,
		// respectively.
		// Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
		// lose; if the sum is 7 or 11 (called natural), you win; if the sum is another
		// value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll
		// the dice until either a 7 or the same point value is rolled. If 7 is rolled,
		// you lose. Otherwise, you win. Your program acts as a single player.

		int[] play = roll();

		int a = play[0] + play[1], help, roll = 0;

		if (a == 2 || a == 3 || a == 12) {
			System.out.printf("You rolled %d. You lose.\n", a);
		} else if (a == 7 || a == 11) {
			System.out.printf("You rolled %d. You win.\n", a);
		} else {
			help = a;
			System.out.printf("You rolled %d. Game continues.\n", help);
			while (roll != help || roll == 7) {
				play = roll();
				roll = play[0] + play[1];
				if (roll == help) {
					System.out.printf("You rolled %d. You win.\n", roll);
				} else if (roll == 7) {
					System.out.printf("You rolled %d. You lose.\n", roll);
					break;
				} else {
					System.out.printf("You rolled %d. Game continues.\n", roll);
				}
			}
		}
	}

	static int[] roll() {

		int a = (int) (Math.random() * 6) + 1, b = (int) Math.random() * 6 + 1;

		return new int[] { a, b };
	}

}
