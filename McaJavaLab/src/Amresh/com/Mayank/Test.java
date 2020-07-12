package Amresh.com.Mayank;

import java.io.FileNotFoundException;

public class Test {
	

	public static void main(String[] args) {
		 
		try {
			 FileCopy.copyFile(args[0], args[1]);
		 }
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Error:Please pass source and destination files name");
			System.out.println("Usages:java Test abc.txt bbc.txt");
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("Error:The given files"+args[0]+","+args[1]+"are not found , make sure that they are available in current path");
		}
		catch(Exception e) {
			System.out.println("Error:Reading or Writing failed");
			e.printStackTrace();
		}
	}	 
}
