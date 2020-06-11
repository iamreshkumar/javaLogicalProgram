/*    Write Java programs to display the following patterns ?
      ------------------------------------------------------
      
      	**********
		**********
		**********
		**********
		**********
		   ****
		   ****
		   ****
		   ****
		   ****

		   
 */
package com.Mayank;

public class Pattern_17 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++)
		 {
		 for(int j = 0; j < 10; j++)
		 {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
		 for(int i = 0; i < 5; i++)
		 {
		 for(int j = 0; j < 3; j++)
		 {
		 System.out.print(" ");
		 }
		 for(int k = 0; k < 4; k++)
		 {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
	}

}
