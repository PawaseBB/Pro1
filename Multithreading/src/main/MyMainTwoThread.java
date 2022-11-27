package main;

import threads.MyThread1;
import threads.MyThread2;

public class MyMainTwoThread {

	public static void main(String[] args)
	{
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.start();
		

	}

}
