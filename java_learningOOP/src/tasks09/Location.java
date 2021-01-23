package tasks09;

class Location {

	// data fields
	public int row, column;
	public double maxValue;

	// constructor
	public Location(int row, int column, double maxValue) {
		super();
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public static Location locateLargest(double[][] a) {

		double largest = 0;
		int row = 0, column = 0;

		// going through rows
		for (int i = 0; i < a.length; i++) {
			// going through columns
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
					row = i;
					column = j;
				}
			}
		}

		return new Location(row, column, largest);
	}

}
