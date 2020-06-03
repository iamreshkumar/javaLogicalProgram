/* Write a program to demonstrate mutual exclusion using thread synchronization.*/
package Amresh.com.Mayank;

public class ThreadSynchronization{
	
	public static void main(String[] args) {
		
		Display d=new Display();
	MyThread mt1=new MyThread(d,"Mayank");
	MyThread mt2=new MyThread(d,"Amresh");
	
	mt1.start();
	mt2.start();
	}
	
}

class Display{
	
	public synchronized void wish(String name) {
		
		for(int i=0;i<=10;i++) {
			System.out.println("Good Morning");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException  e) {
			e.printStackTrace();
		}
		System.out.println(name);
		}
	}
}

class MyThread extends Thread{
	
	Display d;
	String name;
	
	public MyThread(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}


