package edunova;

public class E03foreach {

	public static void main(String[] args) {
		
		//short hand od for petlje
		//ima ograničenja
		//ide od prvog do zadnjeg (koje ne moramo navest)
		//radi s nizovima i s ostalim strukturama podataka(liste, ključ, vrijednost, setovi)
		
		int[] niz= {1,2,4,4,3,3,4,3,4,4};
		
		//for verzija
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		//foreach
		//v=vrijednost u nizu
		for(int v:niz) {
			System.out.println(v);			
		}
		
		//ispiši podatke unazad - NE MOŽE for each
		for(int i=niz.length-1; i>=0;i--) {
			System.out.println(niz[i]);
		}
		
		

	}

}
