package pack3;

import java.util.Scanner;

public class ClassInterThreadB 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("withdraw your money");
	 System.out.println("enter your withdraw amount:");
     float wdraw=sc.nextFloat();
	ClassInterThread fobj=new ClassInterThread();
	Thread t1=new Thread()
	{//Anonymous Inner Class starts here
		public void run()
		{     
				fobj.with_draw(4000);
			
		}
	};//Anonymous Inner Class ends here
	t1.start();
    Thread t2=new Thread()
	{//Anonymous Inner Class starts here
    	
		public void run()
		{   
		
			fobj.deposit(30000);
			notify();
		}
	};
	
	
	t2.start();
	  
}
}
