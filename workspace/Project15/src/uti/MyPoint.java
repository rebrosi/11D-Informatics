package uti;

public class MyPoint {
	private int x;
	private int y;
	public MyPoint() {
		x = 0;
		y = 0;
	}
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(MyPoint point) {
		return Math.sqrt(Math.abs(Math.pow((point.x - this.x), 2) - (Math.pow((point.y - this.y), 2))));
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.abs(Math.pow((x - this.x), 2) - (Math.pow((y - this.y), 2))));
	}
	public static double distance (MyPoint p1, MyPoint p2) {
		return  Math.sqrt(Math.abs(Math.pow((p1.x - p2.x), 2) - (Math.pow((p1.y - p2.y), 2))));

	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
