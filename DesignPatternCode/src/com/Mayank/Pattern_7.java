/*    Write Java programs to display the following patterns ?
      ------------------------------------------------------
        J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A
		J I H G F E D C B A


      */
package com.Mayank;

public class Pattern_7 {
 
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.print((char)(74-j)+" ");
			}
		  System.out.println();
		 }
		
	}
}
