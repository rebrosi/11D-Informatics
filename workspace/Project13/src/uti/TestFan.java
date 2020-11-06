package uti;

public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed(f1.FAST);
		f1.setRadius(5);
		f1.setColor("yellow");
		f1.setSwitchedOn(true);
		f2.setSpeed(f2.MEDIUM);
		f2.setRadius(5);
		f2.setColor("blue");
		f2.setSwitchedOn(false);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
