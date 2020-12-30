package projecteuler;

import java.util.Arrays;

public class Zadatak14 {

	public static void main(String[] args) {
		// The following iterative sequence is defined for the set of positive integers:
		// n → n/2 (n is even)
		// n → 3n + 1 (n is odd)
		// Using the rule above and starting with 13, we generate the following
		// sequence:
		// 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		// It can be seen that this sequence (starting at 13 and finishing at 1)
		// contains 10 terms. Although it has not been proved yet (Collatz Problem), it
		// is thought that all starting numbers finish at 1.
		// Which starting number, under one million, produces the longest chain?
		// NOTE: Once the chain starts the terms are allowed to go above one million.
		
		
		int[] niz=new int[500];
		
			for(int i=0; i<20; i++) {
				niz[0]=i;
				for(int j=0; j<499;j++) {
					if(niz[j]%2==0 && niz[j]!=1) {
						niz[j+1]=niz[j]/2;
					}else if(niz[j]%2!=0 && niz[j]!=1) {
						niz[j+1]=3*niz[j]+1;
					}
				}
				System.out.println(Arrays.toString(niz));
			}
			
			int brojac=0;
			
//			for(int i=0; i<=500) {
//				if(niz[i]!=0) {
//					brojac++
//				}else {
//					
//				}
//			}
			
			
		

		
		
	}
}
