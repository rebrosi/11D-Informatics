package uti;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.name = "Angelica";
		person.address = "Goce Delchev 3";
		person.email = "angelica@yahoo.com";
		person.phoneNumber = 359124563;
		Student student = new Student();
		student.name = "Borko";
		student.address = "Vasil Levski 45";
		student.email = "borko@yahoo.com";
		student.phoneNumber = 23846513;
		student.classStatus = "junior";
		Employee employee = new Employee();
		employee.name = "Valeri";
		employee.address = "Iskar 61";
		employee.email = "valeri@yahoo.com";
		employee.phoneNumber = 974659134;
		employee.office = "Billa";
		employee.salary = 8000;
		Faculty faculty = new Faculty();
		faculty.name = "Fiona";
		faculty.address = "Ami Bue 7";
		faculty.email = "fiona@yahoo.com";
		faculty.phoneNumber = 938645872;
		faculty.office = "Lidl";
		faculty.officeHours = 12;
		faculty.rank = "Boss";
		faculty.salary = 50000;
		Staff staff = new Staff();
		staff.name = "Iskra";
		staff.address = "Hristo Botev 4";
		staff.email = "iskra@yahoo.com";
		staff.phoneNumber = 394653649;
		staff.office = "Bank DSK";
		staff.salary = 1000;
		staff.title = "Secretary";
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		}

}
