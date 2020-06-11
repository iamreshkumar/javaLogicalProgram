/*    Write Java programs to display the following patterns ?
      ------------------------------------------------------
      
      			    *
			       * *
			      * * *
			     * * * *
			    * * * * *
			   * * * * * *
			  * * * * * * *
			 * * * * * * * *
			      * * *
			      * * *
			      * * *
			      * * *
			      * * *
			      * * *
			      * * *
			      
      */
package com.Mayank;

public class Pattern_18 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 8; i++){
				for(int j = 0; j < (8 - i); j++){
					System.out.print(" ");
				}
				for(int k = 0; k <= i; k++){
					System.out.print("*"+" ");
				}
		  System.out.println();
		 }
		 for(int i = 0; i < 7; i++){
			 for(int j = 0; j < 3; j++){
				 System.out.print(" "+" ");
			 }
			 for(int k = 0; k < 3; k++){
				 System.out.print("*"+" ");
			 }
		 System.out.println();
		 }
	}

}
