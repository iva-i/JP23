package edunova;

import java.util.Arrays;

public class E01Nizovi {
	public static void main(String[] args) {
		//potreba za pohranom više vrijednosti istog tipa
		
		//deklaracija
		
		int[] niz;
		
		//inicijalizcija
		
		niz = new int[12];
		int polje[] = {1,2,3,4};
		
		//korištenje
		
		niz[0]=-6;
		polje[polje.length-1]=1; //postaviti na zadnji element
		
		System.out.println(niz[0]);
		System.out.println(polje[polje.length-1]);
		
		//uobičajena sintaksa
		int[] mjeseci = new int[12];
		
		char[] konstante = {'A','K','R'};
				
		System.out.println(konstante[1]);
		
		//višedimenzionalni nizovi
		
		
		//2d
		
		int[][] tablica= new int[5][5];
		
		tablica[0][0]=2;
		tablica[1][1]=2;
		tablica[2][2]=2;
		tablica[3][3]=2;
		tablica[4][4]=2;
		
		System.out.println(Arrays.toString(tablica[0]));
		System.out.println(Arrays.toString(tablica[1]));
		System.out.println(Arrays.toString(tablica[2]));
		System.out.println(Arrays.toString(tablica[3]));
		System.out.println(Arrays.toString(tablica[4]));
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

