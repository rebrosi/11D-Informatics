package uti;

public class Student extends Person{
	public String classStatus;
	public String toString() {
		return super.toString() + ". The class status is " + classStatus;
	}
}
