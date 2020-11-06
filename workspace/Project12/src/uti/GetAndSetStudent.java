package uti;

public class GetAndSetStudent {
	private String name = "";
	private double grade = 0;
	
	public GetAndSetStudent (){
		
	}
	
	public GetAndSetStudent (String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String GetStudentName() {
		return name;
	}
	
	public double GetStudentGrade() {
		return grade;
	}
	
	public void SetStudentName(String name) {
		this.name = name;
	}
	
	public void SetStudentGrade(int grade) {
		this.grade = grade;
	}
}
