package uti;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3, 4);
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(2,3));
		System.out.println(MyPoint.distance(p1, p2));
	}

}
