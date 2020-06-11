/*    Write Java programs to display the following patterns ?
      ------------------------------------------------------
        A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		A B C D E F G H I J
		      
      */
package com.Mayank;

public class Pattern_6 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
		  for(int j = 0; j < 10; j++){
		    System.out.print((char)(65+j)+" ");
		  }
		  System.out.println();
		 }

	}

}
