package edunova;

public class E03MetodeV2 {
	/**
	 * 2.vrsta metoda
	 * 
	 * @param x
	 * @param y
	 */

	public static void ispisi(int x, int y) {
		System.out.println(x + " i " + y);
	}
	
	//method overloading
	
	public static void ispisi(char c) {
		System.out.println(c);
	}
	
	public static void ispisi(char c, int x) {
		System.out.println(c);
	}
	
	//"isto" kao prethoda, ako zamjenimo mjesta parametrima sve ok
	public static void ispisi(int x, char c) {
		System.out.println(c);
	}
	
	

}
