 /* Write a program to calculate salary of n employees using concept of classes 
                                             with constructor and methods */

package Amresh.com.Mayank;
import java.util.Scanner;    

public class Employee{
	static String ename;
	static float salary;
	
	// constructor 
	
	public Employee(String ename,float slary) {
		ename=this.ename;
		salary=this.salary;
	}
	
	// method
	void display() { 
		System.out.println("Name of Employee is::"+ename);
		System.out.println("Salary of Employee is::"+salary);
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of the Employee::");
		   ename=sc.nextLine();
		  
		System.out.println("Enter salary of the Empolyee::");
		   salary=sc.nextFloat();
		  
		  // object creating
		   Employee e1=new Employee(ename, salary);
		    e1.display();
	
	}
}