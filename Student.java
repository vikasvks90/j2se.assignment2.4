package Assignment2;

import java.util.Scanner;

public class Student {
	
	String name;
	int marks,age;
	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in); //to get input from the user
		System.out.println("Please enter the student name");
		st.name = sc.next(); //getting name of the student
		System.out.println("Please enter the marks scored by the student");
		st.marks = sc.nextInt(); //getting the marks scored by the student
		System.out.println("Please enter the age of the student");
		st.age = sc.nextInt(); //getting the age of the student
		
		if ((st.marks > 70) || (st.marks > 60 && st.age <15)){
			System.out.println(st.name+" has achieved"+" 'A' Grade");
		}
		
		else if ((st.marks > 60 && st.marks <= 70) || (st.marks >= 45 && st.marks <= 60 && st.age <15)){
			System.out.println(st.name+" has achieved"+" 'B' Grade");
		}
		
		else if ((st.marks < 61) || (st.marks < 45 && st.age <15)){
			System.out.println(st.name+" has achieved"+" 'C' Grade");
		}
	}

}
