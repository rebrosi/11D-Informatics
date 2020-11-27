package uti;

import java.util.Date;

public class Account {
	public int id = 0;
	public double balance = 0;
	public static double yearInterestRate = 0;
	public Date dateCreated = new Date();

	
	public void withdraw(double sumToWithdraw) {
		balance -= sumToWithdraw;
	}
	
	public void deposit(double sumToDeposit) {
		balance += sumToDeposit;
	}
	
	public String toString() {
		return "The account's ID is " + id + "\nThe accounts balance is " 
				+ balance + "\nThe annual interest rate is " + yearInterestRate + 
				"\nThe account was created on " + dateCreated;
	}
}

