package uti;

public class Person {
	public String name; 
	public String address;
	public long phoneNumber;
	public String email;
	
	public String toString() {
		return "The name of the person is " + name + ". The person lives on the adress"
				+ address + ". The phone number of the person is " + phoneNumber +
				". The email is " + email;
	}
}
