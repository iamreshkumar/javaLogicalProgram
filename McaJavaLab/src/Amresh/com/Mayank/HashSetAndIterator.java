/* Write a program to demonstrate Hashset and Iterator class*/
package Amresh.com.Mayank;
import java.util.*;

public class HashSetAndIterator {
	
	public static void main(String[] args) {
		
		// HashSet class
		HashSet h=new HashSet();
		
		h.add("M");
		h.add("A");
		h.add("Y");
		h.add("A");
		h.add("N");
		h.add("K");
		h.add(10);
		h.add(null);
		
		System.out.println(h.add("k"));
		System.out.println(h);
		System.out.println();
		
		
		// Iterator class
		HashSet hs=new HashSet();
		  for(int i=0;i<=10;i++) {
			  hs.add(i);
		  }
		  System.out.println(hs);
		  java.util.Iterator itr =hs.iterator();
		  
		  while(itr.hasNext()) {
			  Integer I=(Integer)itr.next();
			  if(I%2==0)
				  System.out.println(I);
			  else
				  itr.remove();
		  }
		 
		  System.out.println(hs);
	}
}
// Note:: Here we will not get o/p as insertion order .hashSet  is based on hashcode of object
 