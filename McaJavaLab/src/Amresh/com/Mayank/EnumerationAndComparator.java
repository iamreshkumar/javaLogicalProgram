/* Write a program to demonstrate Enumeration and Comparator interfaces*/
package Amresh.com.Mayank;
import java.util.*;
public class EnumerationAndComparator {

	public static void main(String[] args) {
		
		Vector v=new Vector();
	for(int i=0;i<=10;i++){
		v.addElement(i);
	}
	System.out.println(v);
	
	Enumeration e=v.elements();

	while(e.hasMoreElements()) {
		Integer I=(Integer)e.nextElement();
		if(I%2==0) {
			System.out.println(I);
		}
	}
	
	System.out.println();
	
	TreeSet t=new TreeSet(new MyComparator());
	
	t.add(10);
	t.add(20);
	t.add(30);
	t.add(5);
	t.add(8);
	t.add(40);

	
	System.out.println(t);
	
	
	
	
  }	
}
class MyComparator implements Comparator{
	 public int compare(Object obj1,Object obj2) {
		 Integer I1=(Integer)obj1;
		 Integer I2=(Integer)obj2;
		 if(I1<I2)
			 return +1;
		 else if(I1>I2)
			 return -1;
		 else
			 return 0;
	 }
	
}

