package tasks10;

import java.util.*;

public class ATMMachine {

	public static void main(String[] args) {
		/**
		 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7
		 * to simulate an ATM machine. Create 10 accounts in an array with id 0, 1, . .
		 * . , 9, and an initial balance of $100. The system prompts the user to enter
		 * an id. If the id is entered incorrectly, ask the user to enter a correct id.
		 * Once an id is accepted, the main menu is displayed as shown in the sample
		 * run. You can enter choice 1 for viewing the current balance, 2 for
		 * withdrawing money, 3 for depositing money, and 4 for exiting the main menu.
		 * Once you exit, the system will prompt for an id again. Thus, once the system
		 * starts, it will not stop.
		 */

		Account[] accounts = new Account[10];

		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100.0);
		}

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter an id: ");
			int id = input.nextInt();
			if (id < 0 || id > 9) {
				System.out.println("Invalid id. Enter an id: ");
				id = input.nextInt();
			}

			System.out.println("Main menu \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
			int choice = input.nextInt();
			if (choice < 1 || choice > 4) {
				System.out.println("Invalid input. Enter a choice: ");
			}

			else {
				while (choice != 4) {
					System.out.println(
							"Main menu \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
					choice = input.nextInt();
					if (choice == 1) {
						System.out.println("The balance is $" + accounts[id].getBalance());
					} else if (choice == 2) {
						System.out.println("Enter an amount to withdraw: ");
						accounts[id].withdraw(input.nextDouble());
					} else if (choice == 3) {
						System.out.println("Enter an amount to deposit: ");
						accounts[id].deposit(input.nextInt());
					}
				}
			}

		}

	}
}