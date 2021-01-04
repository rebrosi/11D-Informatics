package uti;

import java.util.ArrayList;

public class Course {
	private String courseName;
	public ArrayList students = new ArrayList();
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents ++;
	}
	public void dropStudent(String student) {
		students.remove(student);
	}
	public String getCourseName() {
		return courseName;
	}
	public void getStudents() {
		System.out.println(students);
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	
}
