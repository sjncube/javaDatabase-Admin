package studentdatabaseapp;

import java.util.Scanner;

/**
 * created by Sizwe Ncube
 */

public class StudeDatabaseApp {
	public static void	main(String[] args) throws Exception{
		
		//create n number of students to add on the database
		System.out.println("Enter number of students");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		
		Student[] students = new Student[numOfStudents];
		
		int n = 0;
		while (n < numOfStudents) {
	
			students[n] = new Student();
			
			students[n].enrollToCourse();
			students[n].getBalance();
			students[n].payTuitinFees();
			
			String status = students[n].regStatus();
			System.out.println(status);
			
			n++;
		}
	}
}