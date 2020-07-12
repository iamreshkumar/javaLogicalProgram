package Amresh.com.Mayank;
import java.io.*;

public class FileCopy {

	public static void copyFile(String srcFile,String destFile)throws FileNotFoundException,IOException{
		
		FileInputStream fs=new FileInputStream(srcFile);
		FileOutputStream fos= new FileOutputStream(destFile);
		
		int i;
		
		while((i = fs.read() )!= -1) {
			fos.write(i);
		}
		System.out.println("Data has Written"+destFile);
	}
}
