package uti;

public class Square extends GeometricObject{
	private double side;
	Square(){
		super();
		side = 1;
	}
	Square(double side, String color, boolean filled){
		super(color, filled);
		this.side = side;
	}
	public void howToColor() {
		System.out.println("Color four sides");
	}
	public void getArea() {
		System.out.println(side * side);
	}
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
