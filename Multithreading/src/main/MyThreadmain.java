package main;

import threads.MyThread1;
import threads.MyThread2;

public class MyThreadmain {

	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("Thread 1");
		System.out.println(myThread1.getName());
		myThread1.setPriority(6);
		myThread1.start();
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
	  	thread.setName("Thread 2");
		System.out.println(thread.getName());
		thread.setPriority(10);
		thread.start();
		
	}

}
