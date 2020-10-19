package uti;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount rosiSave = new SavingsAccount();
		rosiSave.name = "Rosi";
		rosiSave.balance = 10000;
		
		rosiSave.deposit(50);
		rosiSave.withdraw(90);
	}

}
