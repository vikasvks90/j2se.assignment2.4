package Assignment2;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in); //to get input from the user
		System.out.println("Enter the number");
		a = sc.nextInt();  //getting the number
		if (a == 0){
			System.out.println("You Have Entered Zero");
		}
		
		else if (a > 0){
			System.out.println("You Have Entered Positive Value");
		}
		
		else{
			System.out.println("You Have Entered Negative Value");
		}
	}

}
