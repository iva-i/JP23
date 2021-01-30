package tasks11;

import java.lang.String;

public class PersonStaff extends PersonEmployee{

	private String title;

	public PersonStaff() {
		super();
	}
	
	public PersonStaff(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Person's name is " + getName() + " and name of the class is " + this.getClass().getName();
	}
 
	
}
