package uti;

public class Staff extends Employee{
	public String title;
	public String toString() {
		return super.toString() + ". The title is " + title;
	}
}
