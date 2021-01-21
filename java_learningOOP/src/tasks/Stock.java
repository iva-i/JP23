package tasks;

class Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	// constructor that creates a stock with specified symbol and name
	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	// getters and setters
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	// method that returns percent changed
	public double getChangePercent() {
		return (1 - previousClosingPrice / currentPrice) * 100;
	}
}
