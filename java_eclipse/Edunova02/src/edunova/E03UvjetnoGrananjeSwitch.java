package edunova;

public class E03UvjetnoGrananjeSwitch {

	public static void main(String[] args) {
		int i = 5;

		if (i == 5) {
			System.out.println("5");
		} else if (i == 6) {
			System.out.println("x");
		} else if (i == 7) {
			System.out.println("x");
		} else {
			System.out.println("ostalo");
		}

		switch (i) {
		case 5:
			System.out.println("5");
			break;
		case 6:
		case 7:
			System.out.println("x");
			break;
		default:
			System.out.println("ostalo");

		}
		
		
		switch(i) {
		case 5->System.out.println("5");
		case 6,7 ->System.out.println("x");
		default ->System.out.println("ostalo");
		}
		
		
		
		
		
		
		
		
	}

}
