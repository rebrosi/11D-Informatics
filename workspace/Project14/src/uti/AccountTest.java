package uti;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(1122, 20000);
		a1.setYearInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("The balance of the account is " + a1.getBalance() + 
				" , the montly interest is " + a1.getMonthlyInterest() + 
				" and the date on which this account was created is " + a1.getDateCreated());
	}

}
