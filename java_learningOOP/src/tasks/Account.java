package tasks;

import java.util.Date;

class Account {
	
	// data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	// no arg constructor and constructor that creates account with
	// specified id and balance
	public Account() {
		super();
	}
	
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	// getters and setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	// methods
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}
	
	public void deposit(int deposit) {
		this.balance += deposit;
	}
}