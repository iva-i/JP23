package tasks;

import java.util.Scanner;

public class Task3017 {
	public static void main(String[] args) {
		// (Game: scissor, rock, paper) Write a program that plays the popular
		// scissor–rock–paper game. (A scissor can cut a paper, a rock can knock
		// a scissor, and a paper can wrap a rock.)
		// The program randomly generates a number 0, 1, or 2 representing
		// scissor, rock, and paper. The program prompts the user to enter a number 0,
		// 1, or 2 and displays a message indicating whether the user or the computer
		// wins, loses, or draws.

		Scanner input = new Scanner(System.in);

		int player, comp;

		// player plays until he enters valid values
		do {
			System.out.println("scissor (1) - rock (2) - paper (3): ");
			player = input.nextInt();
		} while (player < 1 || player > 3);

		// closing input
		input.close();

		// computer generates random number 1,2 or 3
		do {
			comp = (int) (Math.random() * 10);
		} while (comp < 1 || comp > 3);

		// checking who won
		if (player == comp) {
			System.out.printf("The computer is %s. You are %s. It is a draw.", display(comp), display(player));
		} else if ((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2)) {
			System.out.printf("The computer is %s. You are %s. You won.", display(comp), display(player));
		} else {
			System.out.printf("The computer is %s. You are %s. Computer won.", display(comp), display(player));
		}

	}

	// method shows what was played
	static String display(int x) {

		if (x == 1) {
			return "scissor";
		} else if (x == 2) {
			return "rock";
		} else {
			return "paper";
		}

	}
}
