package edunova;

public class E02ForPetlja {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Osijek");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		int zbroj = 0;

		for (int i = 1; i <= 100; i++) {
			zbroj += i;
		}
		System.out.println(zbroj);

		// preskakanje koraka

		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("broj je; " + i);
		}

		// prisilno zaustavljanje

		for (int i = 0; i < 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}

		// ugnjezdivanje petlji

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((i + 1) * (j + 1) + " ");
			}
			System.out.println();
		}

		// beskonačne petlje - kod predavača
		
		
		
			
		
		
		
		
	}

}
