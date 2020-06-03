/* Write a program to demonstrate Linked List Class*/
package Amresh.com.Mayank;

import java.util.LinkedList.*;		

public class LinkedList {
	public static void main(String[] args) {
		
		// LinkedList l=new LinkedList();
		java.util.LinkedList <Object> l = new java.util.LinkedList<Object> ();
	
		// Adding element
	l.add("mayank");
	l.add("software");
	l.add("solution");
	
	// Replacing element with index value
	l.set(0,"mnu");
	l.add(1000);
	l.add(null);
	
	// removing last element
	l.removeLast();
	
	System.out.println(l);
	
	}
}
