package tasks11;

import java.util.Date;

public class PersonEmployee extends Person{
	
	private String office;
	private double salary;
	private Date dateHired;
	
	public PersonEmployee() {
		super();
	}
	
	public PersonEmployee(String name) {
		super(name);
	}
	
	public PersonEmployee(String office, double salary, Date dateHired) {
		super();
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return "Person's name is " + getName() + " and name of the class is " + this.getClass().getName();
	}
	
	
	
	

}
