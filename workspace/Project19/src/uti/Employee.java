package uti;

public class Employee extends Person{
	public String office;
	public double salary;
	public java.util.Date dateEmployed;
	public String toString() {
		return super.toString() + ". The office is " + office + ". The salary is " +
	salary + ". The person was employed on " + dateEmployed;
	}
}
