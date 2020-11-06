package uti;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon p1 = new RegularPolygon ();
		RegularPolygon p2 = new RegularPolygon (6, 4);
		RegularPolygon p3 = new RegularPolygon (10, 4, 5.6, 7.8);
		System.out.println("The perimeter of the first regular polygon is " + p1.getPerimeter() + 
				" and its area is " + p1.getArea());
		System.out.println("The perimeter of the second regular polygon is " + p2.getPerimeter() + 
				" and its area is " + p2.getArea());
		System.out.println("The perimeter of the third regular polygon is " + p3.getPerimeter() + 
				" and its area is " + p3.getArea());
	}

}
