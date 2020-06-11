/*    Write Java programs to display the following patterns ?
      ------------------------------------------------------
        J J J J J J J J J J
		I I I I I I I I I I
		H H H H H H H H H H
		G G G G G G G G G G
		F F F F F F F F F F
		E E E E E E E E E E
		D D D D D D D D D D
		C C C C C C C C C C
		B B B B B B B B B B
		A A A A A A A A A A
		
    */
package com.Mayank;

public class Pattern_9 {
	 public static void main(String[] args) {
		
		 for(int i = 0; i < 10; i++){
			 for(int j = 0; j < 10; j++){
		        System.out.print((char)(74-i)+" ");
		      }
		   System.out.println();
		 }
	}
}
