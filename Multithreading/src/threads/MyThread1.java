package threads;

public class MyThread1  extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++)
		{
			System.out.println("MyThread is now running...!!");
		}
	}

}
