package tasks;

public class Task3024 {

	public static void main(String[] args) {
		// (Game: pick a card) Write a program that simulates picking a card
		// from a deck of 52 cards. Your program should display the rank
		// (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
		// and suit (Clubs, Diamonds, Hearts, Spades) of the card.

		int rankNum, suitNum;

		// picking random number for rankNum
		do {
			rankNum = (int) (Math.random() * 13 + 1);
		} while (rankNum < 1 || rankNum > 13);

		// picking random number for suit
		do {
			suitNum = (int) (Math.random() * 4 + 1);
		} while (suitNum < 1 || suitNum > 4);

		// printing what card was generated
		System.out.printf("The card you picked is %s of %s.", rank(rankNum), suit(suitNum));

	}

	// method returns rank of a card
	static String rank(int x) {
		
		String card = "abc"; // had to initialize String for method to work
		
		switch (x) {
		case 1 -> card = "Ace";
		case 2 -> card = "2";
		case 3 -> card = "3";
		case 4 -> card = "4";
		case 5 -> card = "5";
		case 6 -> card = "6";
		case 7 -> card = "7";
		case 8 -> card = "8";
		case 9 -> card = "9";
		case 10 -> card = "10";
		case 11 -> card = "Jack";
		case 12 -> card = "Queen";
		case 13 -> card = "King";
		}
		return card;
	}

	// method returns suit of a card
	static String suit(int x) {
		
		String card = "abc";
		
		switch (x) {
		case 1 -> card = "Clubs";
		case 2 -> card = "Diamonds";
		case 3 -> card = "Hearts";
		case 4 -> card = "Spades";
		}
		return card;
	}

}
