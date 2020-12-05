package uti;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		//create a Scanner object for keyboard input
		Scanner in = new Scanner(System.in);	
		//create local variables
		
		int maxSize, menuChoice;
		
		//prompt the user until they enter a number >= zero
		maxSize = getNumProducts(in);

		if(maxSize ==0) {
			//Display a no products message if zero is entered
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
	        addToInventory(products, maxSize);
	        do {
	        	menuChoice = getMenuOption(in);
	        	executeMenuChoice(menuChoice, products, in);
	        }while(menuChoice != 0);
	        
		}//endif
		
	}//end method main
	
	public static void displayInventory(Product[] products) {
		//display the contents of the products array
        for(Product product: products)
        	System.out.println(product);
        //endfor
	}
	
	public static void addToInventory(Product[] products, int maxSize) {
		Scanner in = new Scanner(System.in);
		int stockChoice = -1;
		while(stockChoice != 1 || stockChoice != 2) {
			System.out.println("1: CD\n2: DVD\nPlease enter the product type:");
			stockChoice = in.nextInt();
			//System.out.println("Stock Choice is " + stockChoice);
			if (stockChoice == 1 ) {
				addCDToInventory(products, maxSize);
				break;
			}else if (stockChoice == 2 ){
				addDVDToInventory(products, maxSize);
				break;
			} else {
				System.out.println("Only numbers 1 or 2 allowed!");
			}
		}
		
	}
	
	public static void addCDToInventory(Product[] products, int maxSize) {
		Scanner in = new Scanner(System.in);
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		String tempArtist;
		int tempNumberOfSongs;
		String tempLabel;
		for(int i = 0; i<maxSize; i++) {
        	in.nextLine();
        	//ask the user to enter the product information
    		System.out.print("\n\nPlease enter the CD name: ");
    		tempName = in.nextLine();
    		System.out.print("Please enter the artist name: ");
    		tempArtist = in.nextLine();
    		System.out.print("Please enter the record label name: ");
    		tempLabel = in.nextLine();
    		System.out.print("Please enter the number of songs: ");
    		tempNumberOfSongs = in.nextInt();
    		System.out.print("Please enter the quantity of stock for this product: ");
    		tempQty = in.nextInt();
    		System.out.print("Please enter the price for this product: ");
    		tempPrice = in.nextDouble();
    		System.out.print("Please enter the item number: ");
    		tempNumber = in.nextInt();
    		//create a product object and store it in the products array
    		products[i] = new CD(tempNumber, tempName, tempQty, tempPrice, tempArtist, tempNumberOfSongs, tempLabel);
        }//endfor
	}
	
	public static void addDVDToInventory(Product[] products, int maxSize) {
		Scanner in = new Scanner(System.in);
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		int tempLengthMinutes;
		int tempAgeRating;
		String tempFilmStudio;
		for(int i = 0; i<maxSize; i++) {
        	in.nextLine();
        	//ask the user to enter the product information
    		System.out.print("\n\nPlease enter the DVD name: ");
    		tempName = in.nextLine();
    		System.out.print("\n\nPlease enter the flm studio name: ");
    		tempFilmStudio = in.nextLine();
    		System.out.print("Please enter the age rating: ");
    		tempAgeRating = in.nextInt();
    		System.out.print("Please enter the length in minutes: ");
    		tempLengthMinutes = in.nextInt();
    		System.out.print("Please enter the quantity of stock for this product: ");
    		tempQty = in.nextInt();
    		System.out.print("Please enter the price for this product: ");
    		tempPrice = in.nextDouble();
    		System.out.print("Please enter the item number: ");
    		tempNumber = in.nextInt();
    		//create a product object and store it in the products array
    		products[i] = new DVD(tempNumber, tempName, tempQty, tempPrice, tempLengthMinutes, tempAgeRating, tempFilmStudio);
        }//endfor
	}
	
	public static int getNumProducts(Scanner in) {
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
		
		System.out.println("1.View Inventory\n2.Add Stock\n3.Deduct Stock"
				+ "\n4.Discontinue Stock\n0.Exit\nPlease enter a menu option");
		int option = in.nextInt();
		while(option < 0 || option > 4) {
				System.out.println("Incorrect value entered");
				option = in.nextInt();
		}
		return option;
	}
	public static int getProductNumber(Product[] products, Scanner in) {
		int productChoice = -1;
		for(int i = 0; i < products.length; i++) {
			System.out.println((i + 1) + ". " + products[i].getName());
		}
		while(productChoice < 0 || productChoice > products.length) {
			System.out.println("Enter the number of the product you have chosen");
			productChoice = in.nextInt();
			if (productChoice < 0 || productChoice > products.length) {
				System.out.println("Incorrect value entered");
			}
		}
		return productChoice;
	}
	
	public static void addInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue = -1;
		productChoice = getProductNumber(products, in);
		while(updateValue < 0) {
			System.out.println("How many products do you want to add?");
			updateValue = in.nextInt();
			if (updateValue < 0) {
				System.out.println("Incorrect value entered");
			}
		}
		products[productChoice - 1].addToInventory(updateValue);
	}
	
	public static void deductInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue = -1;
		productChoice = getProductNumber(products, in);
		while(updateValue < 0 || updateValue > products[productChoice - 1].getQtyInStock()) {
			System.out.println("How many products do you want to add?");
			updateValue = in.nextInt();
			if (updateValue < 0 || updateValue > products[productChoice - 1].getQtyInStock()) {
				System.out.println("Incorrect value entered");
			}
		}
		products[productChoice - 1].deductFromInventory(updateValue);
	}
	
	public static void discountinueInventory(Product[] products, Scanner in) {
		int productChoice;
		productChoice = getProductNumber(products, in);
		products[productChoice - 1].setActive(false);
	}
	
	public static void executeMenuChoice(int menuChoice, Product[] products, Scanner in) {
		switch(menuChoice) {
		case 1: 
			System.out.println("View Product List");
			displayInventory(products);
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
			System.out.println("Discountinue Stock");
			discountinueInventory(products, in);
			break;
		}
	}
}//end class ProductTaster