package uti;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the first side");
		double side1 = sc.nextDouble();
		System.out.println("Enter the length of the second side");
		double side2 = sc.nextDouble();
		System.out.println("Enter the length of the third side");
		double side3 = sc.nextDouble();
		Triangle triangle1 = new Triangle(side1, side2, side3);
		System.out.println("Enter the color of the triangle");
		triangle1.setColor(sc.next());
		System.out.println("Enter wheter the triangle is filled. Write true or false");
		triangle1.setFilled(sc.nextBoolean());
		System.out.println("The perimeter is " + triangle1.getPerimeter() + "\nThe area is " + 
		triangle1.getArea() + "\nThe color is " + triangle1.getColor() + " and filled: "
				+ triangle1.isFilled());
//		if(isFilled == "yes") {
//			System.out.println("The triangle is filled");
//		}else {
//			System.out.println("The triangle is not filled");
//		}
	}

}
