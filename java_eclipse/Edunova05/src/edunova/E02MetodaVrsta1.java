package edunova;

public class E02MetodaVrsta1 {
	
	//ako nema public - pristup smao u paketu!!!
	//ako nema static - pristup u drugoj klasi nije moguć
	
	/**
	 * 1.vrsta metoda
	 * ne prima parametar
	 * ne vraća vrijednost
	 *
	 */

	public static void odradiPosao() {
		
		System.out.println("Metoda odradiPosao()");
		
		for(int i=0; i<10;i++) {
			System.out.println("Osijek");
		}
	}
	
	/**
	 * kada nije definiran način pristupa tada se misli na package način pristupa
	 */
	static void packageScope() {
		
	}
	
	void nijeStatic() {
		
	}

}
