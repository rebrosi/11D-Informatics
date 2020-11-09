package uti;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	Date dateCreated = new Date();
	
	Account(){
		
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
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
	
	public double getYearInterestRate() {
		return yearInterestRate;
	}
	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (yearInterestRate / 100) / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * ((yearInterestRate / 100) / 12);
	}
	
	public void withdraw(int sumToWithdraw) {
		balance -= sumToWithdraw;
	}
	
	public void deposit(int sumToDeposit) {
		balance += sumToDeposit;
	}
}
