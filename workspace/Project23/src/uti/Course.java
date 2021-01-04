package uti;

public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[256];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents ++;
	}
	public void dropStudent(String student) {
		int numberOfDropStudent = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i] == student) {
				numberOfDropStudent = i;
				break;
			}
		}
		for(int i = students.length - 1; i > numberOfDropStudent; i--) {
			students[i] = students[i -1];
		}
		students[students.length] = null;
	}
	public String getCourseName() {
		return courseName;
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	
}
