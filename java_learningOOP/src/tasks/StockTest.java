package tasks;

public class StockTest {
	public static void main(String[] args) {
	
	//creating Stock object
	Stock stock1 = new Stock("ORCL", "Oracle Corporation");
	
	//setting prices
	stock1.setPreviousClosingPrice(34.5);
	stock1.setCurrentPrice(34.35);
	
	//printing price change percent
	System.out.println("Price-change percent is: " + stock1.getChangePercent() + "%");
		
	}

}
