package tasks;

public class AccountTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that creates an Account object with an account ID of
		 * 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the
		 * withdraw method to withdraw $2,500, use the deposit method to deposit $3,000,
		 * and print the balance, the monthly interest, and the date when this account
		 * was created.
		 */

		Account acc = new Account(1122, 20000);

		acc.setAnnualInterestRate(4.5);

		acc.withdraw(2500);

		acc.deposit(3000);

		System.out.println("Balance: " + acc.getBalance() + "\n Monthly interest: " + acc.getMonthlyInterest()
				+ "\n Date: " + acc.getDateCreated());

	}

}
