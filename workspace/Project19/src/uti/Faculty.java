package uti;

public class Faculty extends Employee{
	public double officeHours;
	public String rank;
	public String toString() {
		return super.toString() + ". The office hours are " + officeHours + ". The rank is "
				+ rank;
	}
}
