package tasks;

public class Task5007 {

	public static void main(String[] args) {
		// (Financial application: compute future tuition)
		// Suppose that the tuition for a university is $10,000 this year
		// and increases 6% every year. In one year, the tuition
		// will be $10,600. Write a program that computes the tuition in
		// ten years and the total cost of four years’ worth of tuition after
		// the tenth year.
		
		double tuition = 10000, cost=0; 
		
		for(int i=1;i<=14; i++) {
			tuition = tuition + tuition*0.06;
			
			//program prints tuition in ten years
			if(i==10) {
				System.out.printf("Tuition  in ten years is $%.2f. \n", tuition);
			}
			
			//program calculates total cost of four years worth of tuition after
			// the tenth year.
			if(i>10 && i<=14) {
				cost += tuition;
			}
			
		}
		
		System.out.printf("Total cost of four years worth of tuition after the tenth year is $%.2f.",cost);

	}

}
