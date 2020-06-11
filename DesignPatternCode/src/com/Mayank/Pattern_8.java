/*    Write Java programs to display the following patterns ?
      ------------------------------------------------------
        A A A A A A A A A A
		B B B B B B B B B B
		C C C C C C C C C C
		D D D D D D D D D D
		E E E E E E E E E E
		F F F F F F F F F F
		G G G G G G G G G G
		H H H H H H H H H H
		I I I I I I I I I I
		J J J J J J J J J J

*/
package com.Mayank;

public class Pattern_8 {
 public static void main(String[] args) {
	
	 for(int i = 0; i < 10; i++){
		 for(int j = 0; j < 10; j++){
			 System.out.print((char)(65+i)+" ");
		 }
	   System.out.println();
	 }
}
}
