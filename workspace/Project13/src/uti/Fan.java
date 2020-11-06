package uti;

public class Fan {
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "blue";
	
	public int getSpeed () {
		return speed;
	}
	public void setSpeed (int speed) {
		this.speed = speed;
	}
	
	public boolean getSwitchedOn () {
		return switchedOn;
	}
	public void setSwitchedOn (boolean switchedOn) {
		this.switchedOn = switchedOn;
	}
	
	public double getRadius () {
		return radius;
	}
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	public String getColor () {
		return color;
	}
	public void setColor (String color) {
		this.color = color;
	}
	
	Fan(){
	}
	
	public String toString() {
		String message = "";
		if (switchedOn) {
			message = "The speed is " + speed + ", the color is " + color + ", the radius is " + radius;
			return message;
		} 
		message = "The fan is switched off, but the color is " + color + " and the radius is " + radius;
		return message;
	}
}
