package edunova;

public class E06Rekurzija {
	
	//rekurzija je kada metoda zove samu sebe
	//uz uvijet izlaska iz rekurzije
	
	public static void main(String[] args) {
		int zbroj = 0;
		for(int i = 0; i<101; i++) {
			zbroj+=i;
		}
		System.out.println(zbroj);
		
		System.out.println(zbroj(100));
	}
	
	static int zbroj(int broj) {
		if(broj ==0) {
			return 0;
		}
		
		return broj + zbroj (broj-1);
	}
}
