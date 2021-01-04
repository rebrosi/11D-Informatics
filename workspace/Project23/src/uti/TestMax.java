package uti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public abstract class TestMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(6);
		Rectangle r1 = new Rectangle(2, 6);
		Rectangle r2 = new Rectangle(9, 7);
		Rectangle r3 = new Rectangle(5, 12);
		Rectangle r4 = new Rectangle(4, 2);
		Rectangle r5 = new Rectangle(1, 6);
		int i = c1.max(c2);
		if (i == 0) {
			System.out.println("The circles are egual");
		} else if (i > 0) {
			System.out.println("c1 is larger");
		} else if (i < 0) {
			System.out.println("c2 is larger");
		}
		int k =r1.max(r2);
		if (k == 0) {
			System.out.println("The rectangles are egual");
		} else if (k > 0) {
			System.out.println("r1 is larger");
		} else if (k < 0) {
			System.out.println("r2 is larger");
		}
		
		ArrayList<Rectangle> recArray = new ArrayList<Rectangle>();
		recArray.add(r1);
		recArray.add(r2);
		recArray.add(r3);
		recArray.add(r4);
		recArray.add(r5);
		
		Collections.sort(recArray);
		
		for (Rectangle counter : recArray) {
			System.out.println(counter);
		}

	}

}
