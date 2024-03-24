package threads;

import java.util.Scanner;

public class ClassL
{
  public static void main(String[] args) 
  {
	System.out.println("welcome to state bank of India");
	ClassK kobj=new ClassK();
	
	Thread t1=new Thread() {
			public void run()
			{//anonymous inner class
		try 
		{
			
		kobj.with_draw(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
			}
};
Thread t2=new Thread()
{
	public void run()
	{
		
			kobj.deposit(1000);
		
		
	}
};
t1.start();
t2.start();
}
}