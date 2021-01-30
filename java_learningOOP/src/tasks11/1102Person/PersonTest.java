package tasks11;

public class PersonTest {

	public PersonTest() {
		PersonEmployee personE = new PersonEmployee("Dwight");
		
		System.out.println(personE.toString());
		
		PersonFaculty personF = new PersonFaculty("Toby");
		
		System.out.println(personF.toString());
		
		PersonStaff personSta = new PersonStaff();
		personSta.setName("Stanely");
		
		System.out.println(personSta.toString());
		
		PersonStudent personStu = new PersonStudent("Creed");
		
		System.out.println(personStu.toString());
	}
	
	public static void main(String[] args) {

		new PersonTest(); 

	}

}
