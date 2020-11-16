package uti;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account [] atm = new Account[10];
		for(int i = 0; i < atm.length; i ++) {
			atm[i] = new Account(i, 100);
		}
		while(1 > 0) {
			System.out.println("Enter an ID");
			int id = sc.nextInt();
			if(id >= 0 || id <= 9) {
				System.out.println("Choose an option: \n1. show curent balance\n2. withdraw money\n3. deposit money\n4. exit the main menu");
				int answer = sc.nextInt();
				if(answer == 1) {
					System.out.println("The current balance is " + atm[id].getBalance());
				} else if(answer == 2) {
					System.out.println("How much money you want to withdraw");
					double money = sc.nextDouble();
					atm[id].withdraw(money);
				} else if(answer == 3) {
					System.out.println("How much money you want to deposit");
					double money = sc.nextDouble();
					atm[id].deposit(money);
				} else if(answer == 4) {
					
				}
			}else {
				System.out.println("Enter a valid ID");
			}
		}
	}

}
