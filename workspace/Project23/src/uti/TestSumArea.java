package uti;

public class TestSumArea {

	public static void main(String[] args) {
		GeometricObject[] obj  = new GeometricObject[4];
		obj[0] = new Circle(2);
		obj[1] = new Circle(4);
		obj[2] = new Rectangle(2, 8);
		obj[3] = new Rectangle(13, 2);
		
		System.out.println(sumArea(obj));

	}
	
	public static double sumArea(GeometricObject[] a) {
		double area = 0;
		for (int i = 0; i < a.length; i++) {
			area += a[i].getArea();
		}
		return area;
	}
}
