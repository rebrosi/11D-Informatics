package uti;

public class SavingsAccount {
	public double balance;
	public String name;
	public double interestRate = 0.01;
	
	public void deposit(int sum){
		balance += sum;
	}
	
	public void withdraw (int sum){
		if (sum < 0 || sum > balance){
			System.out.println("Error");
			return;
		}
		balance -= sum;
		System.out.println("Successful withdraw of " + sum + " new balance " + balance);
	}
}
