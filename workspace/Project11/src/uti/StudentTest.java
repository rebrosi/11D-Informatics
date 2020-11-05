package uti;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[5];
		for(int i = 0; i < st.length; i++) {
			System.out.println("Enter the name of student " + (i + 1));
			String name = sc.next();
			System.out.println("Enter the grade of student " + (i + 1));
			double grade = sc.nextDouble();
			st[i] = new Student (name,grade);
		}
		ScholarshipForManyStudents(st);
		sc.close();
	}
	
	public static boolean Scholarship (Student st) {
		if (st.grade > 5.5) {
			return true;
		}
		return false;
	}
	
	public static void ScholarshipForManyStudents (Student ... st) {
		for (int i = 0; i < st.length; i++) {
			if (st[i].grade > 5.5) {
				System.out.println(st[i].name);
			}
		}
	}

}
