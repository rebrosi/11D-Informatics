package uti;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		//create a Scanner object for keyboard input
		Scanner in = new Scanner(System.in);	
		//create local variables
//		int tempNumber;
//		String tempName;
//		int tempQty;
//		double tempPrice;
		int menuChoice;
		int maxSize;
		
		//prompt the user until they enter a number >= zero
		maxSize = getNumProducts(in);

		if(maxSize ==0) {
			//Display a no products message if zero is entered
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
			addToInventory(products, in, maxSize);
			do {
				menuChoice = getMenuOption(in);
				executeMenuChoice(menuChoice, products, in);
			} while(menuChoice != 0);
//	        for(int i = 0; i<maxSize; i++) {
//	        	in.nextLine();
//	        	//ask the user to enter the product information
//	    		System.out.print("\n\nPlease enter the product name: ");
//	    		tempName = in.nextLine();
//	    		System.out.print("Please enter the quantity of stock for this product: ");
//	    		tempQty = in.nextInt();
//	    		System.out.print("Please enter the price for this product: ");
//	    		tempPrice = in.nextDouble();
//	    		System.out.print("Please enter the item number: ");
//	    		tempNumber = in.nextInt();
//	    		//create a product object and store it in the products array
//	    		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
//	        }//endfor
	
	        //display the contents of the products array
//	        for(Product product: products)
//	        	System.out.println(product);
	        displayInventory(products);
	        //endor
	        
		}//endif
		
	}//end method main

	public static void displayInventory (Product [] products) {
		for(Product product: products)
        	System.out.println(product);
	}
	public static void addToInventory(Product [] products, Scanner in, int maxSize) {
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		for(int i = 0; i<maxSize; i++) {
        	in.nextLine();
        	//ask the user to enter the product information
    		System.out.print("\n\nPlease enter the product name: ");
    		tempName = in.nextLine();
    		System.out.print("Please enter the quantity of stock for this product: ");
    		tempQty = in.nextInt();
    		System.out.print("Please enter the price for this product: ");
    		tempPrice = in.nextDouble();
    		System.out.print("Please enter the item number: ");
    		tempNumber = in.nextInt();
    		//create a product object and store it in the products array
    		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
        }
	}
	static public int getNumProducts(Scanner in) {
		int maxSize = -1;
		do {
			try{
				//display prompt to user		
				System.out.println("Enter the number of products you would like to add.");
				System.out.print("Enter 0 (zero) if you do not wish to add products: ");
				//assume that the user enters a valid 
				maxSize = in.nextInt();	
				if(maxSize<0)
					System.out.println("Incorrect Value entered");
				//endif
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			catch(Exception e){
				System.out.println(e);
				in.nextLine();
			}
		}while(maxSize<0);
		return maxSize;
	}
	public static int getMenuOption(Scanner in) {
		int option;
		System.out.println("1. View Inventory\n"
				+ "2. Add Stock\n"
				+ "3. Deduct Stock\n"
				+ "4. Discontinue Product\n"
				+ "5. Exit\n"
				+ "Please enter a menu option:");
		option = in.nextInt();
		while (option < 1 || option > 5) {
			System.out.println("Please enter a correct value");
			option = in.nextInt();
		}
		return option;
	}
	public static int getProductNumber(Product[] products, Scanner in) {
		int productChoice = -1;
		for(int i = 0; i < products.length; i++) {
			System.out.println(i + ". " + products[i + 1].getName());
		}
		System.out.println("Enter the index of the product you want to update");
		productChoice = in.nextInt();
		while(productChoice > products.length) {
			System.out.println("Please enter a correct value");
			productChoice = in.nextInt();
		}
		return productChoice;
	}
	public static void addInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue = -1;
		//maxSize++;
		productChoice = getProductNumber(products, in);
		System.out.println(productChoice);
		System.out.println("How many products do you want to add?");
		updateValue = in.nextInt();
		while(updateValue < 0) {
			System.out.println("Please enter a positive value of 0 and above");
			updateValue = in.nextInt();
		}
		products[productChoice].addToInventory(updateValue);
	}
	public static void deductInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue = -1;
		productChoice = getProductNumber(products, in);
		System.out.println("How many products do you want to deduct?");
		updateValue = in.nextInt();
		while(updateValue < 0) {
			System.out.println("Please enter a positive value of 0 and above");
			updateValue = in.nextInt();
		}
		products[productChoice].deductFromInventory(updateValue);
	}
	public static void discontinueInventory(Product[] products, Scanner in) {
		int productChoice = getProductNumber(products, in);
		products[productChoice].setActive(false);
	}
	public static void executeMenuChoice(int option, Product[] products, Scanner in) {
		switch(option) {
		case 1:
			System.out.println("View Product List");
			displayInventory (products);
			break;
		case 2:
			System.out.println("Add Stock");
			addInventory(products, in);
			break;
		case 3:
			System.out.println("Deduct Stock");
			deductInventory(products, in);
			break;
		case 4:
			System.out.println("Discontinue Stock");
			discontinueInventory(products, in);
			break;
		case 5:
			option = 0;
			break;
		}
	}
}//end class ProductTaster
