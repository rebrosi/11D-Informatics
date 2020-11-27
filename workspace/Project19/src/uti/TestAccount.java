package uti;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.yearInterestRate = 1.0;
		Account account = new Account();
		account.balance = 1000;
		account.id = 01;
		account.deposit(100);
		account.withdraw(30);
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.balance = 1000;
		savingsAccount.id = 02;
		savingsAccount.deposit(10050);
		savingsAccount.withdraw(303);
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.balance = 1000;
		checkingAccount.id = 03;
		checkingAccount.overdraftLimit = 1500;
		checkingAccount.deposit(600);
		checkingAccount.withdraw(303);
		
		System.out.println(account.toString());
		System.out.println(savingsAccount.toString());
		System.out.println(checkingAccount.toString());

	}

}
