package uti;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] g = new GeometricObject[5];
		g[0] = new Square(2, "red", true);
		g[1] = new Square(5, "white", false);
		g[2] = new Square(13, "brown", false);
		g[3] = new Square(10, "yellow", true);
		g[4] = new Square(9, "purple", true);
		
		for(int i = 0; i < g.length; i++) {
			g[i].getArea();
			if (g[i].isFilled()) {
				g[i].howToColor();
			}
		}
		
	}

}
