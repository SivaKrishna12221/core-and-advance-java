package java8;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println(i);
		}
	}
}
class ThreadUsingRunnable implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadClass {
   
	public static void main(String[] args) {
//	MyThread th1=new MyThread();
//	Thread th=new Thread(th1);
//	th.start();
//    Runnable runnable=new ThreadUsingRunnable();
//    Thread th3=new Thread(runnable);
//    th3.start();
   
		/*Runnable run=new Runnable()
				{
			@Override
			public void run() {
				for(int i=0;i<=4;i++)
				{
					System.out.println(i);
				}	
				
			}
				};
		Thread th1=new Thread(run);
		th1.start();*/
		
		Runnable rn= ()->{
			for(int i=0;i<=4;i++)
			{
				System.out.println(i);
			}
		};
		Thread th=new Thread(rn);
		th.start();
}
}