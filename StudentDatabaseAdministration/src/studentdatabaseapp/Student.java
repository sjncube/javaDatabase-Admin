package studentdatabaseapp;
import java.util.*;

/**
 * created by Sizwe Ncube
 */

public class		Student {
	private	String	firstName;
	private	String	lastName;
	private	int		accademicYear;
	private String	studentID;
	private String	courses = "";
	private int		tuitionBalance;
	private	static	int	couseCosts = 600;
	private	static	int	id = 1000;
	
	
	//prompt user to enter student name and year of study
	public	Student() {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName = input.nextLine();
		
		System.out.println("Enter student's last name: ");
		this.lastName = input.nextLine();
		
		System.out.println("Enter student's academic year or level\n\n" +
				"1 Fresher(1st year)\n" +
				"2 Junior(2nd - 3rd Year)\n" +
				"3 Senior(Last year) ");
		this.accademicYear = input.nextInt();
		
		setStudentId();
		//System.out.println("Your studentID is: "+studentID);
	
	}
	
	//Generate studentID(Student number)
	private	void	setStudentId() {
		id++;
		this.studentID = accademicYear + "" + id;
	}
		
	//Enroll to course
	public void enrollToCourse(){
		while (1 != 0){
		System.out.println("Which course do you want to enroll on? (Q to escape)");
		Scanner input = new Scanner(System.in);
		String course = input.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n   " + course;
			tuitionBalance = tuitionBalance + couseCosts;
		}else {break;}
				}
		//System.out.println("Successfully enrolled in " + courses);
	}
	//View student balance
	public void getBalance() {
		System.out.println("Tuition Balance: "+ tuitionBalance + "ZAR\n");
	}
	
	//Pay tuition fees
	public void payTuitinFees() {
		System.out.print("Enter payment amount: ");
		Scanner input= new Scanner(System.in);
		int payment = input.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: "+ payment+"ZAR");
		getBalance();
	}
	
	//Show registration status
	public String regStatus() {
		return "Name(s): "+ firstName +" "+ lastName + "\n" +
			   "Accademic Year: " +accademicYear+"\n" +
			   "StudentID: " + studentID + "\n"+
			   "Course(s) enrolled: "+courses +"\n" +
			   "Balance: "+ tuitionBalance+"ZAR\n";
	}
}