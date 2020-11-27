package uti;

public class CheckingAccount extends Account{
	public double overdraftLimit;
	
	public void deposit(double sumToDeposit) {
		if((sumToDeposit + balance) <= overdraftLimit) {
			balance += sumToDeposit;
		} else {
			System.out.println("This sum is over the overdraft limit");
		}
	}
}
