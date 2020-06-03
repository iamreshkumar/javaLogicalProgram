/* Write a program to demonstrate various arithmetic calculations using packages.*/
package Amresh.com.Mayank;
import java.util.Scanner;

public class ArithmeticSolution extends ArithmeticCalculations{
	
	int add;
	int sub;
	int mul;
	float div;
	
	public ArithmeticSolution() {
		
		add=this.add;
		sub=this.sub;
		mul=this.mul;
		div=this.div;
	 }
	
	{
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
	}
	
	void display() {
		System.out.println("Your given Digit is::"+a+" and "+b);
		System.out.println("Addition   is	 ::"+add);
		System.out.println("Substraction is	 ::"+sub);
		System.out.println("Multipication is ::"+mul);
		System.out.println("Divison  is	::"+div);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first digit::");
		a=sc.nextInt();
		
		System.out.println("Enter the Secound digit::");
		b=sc.nextInt();
		
		ArithmeticSolution as= new ArithmeticSolution();
		
		as.display();
		
		
	}

}
