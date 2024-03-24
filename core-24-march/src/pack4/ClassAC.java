package pack4;

public class ClassAC extends Thread
{
public void run()
{
	String name=Thread.currentThread().getName();
	int priority=Thread.currentThread().getPriority();
	
	for(int i=1;i<=5;i++)
	{
		System.out.println(name+"("+priority+")"+" run method executes :"+i);
	}

}
public static void main(String[] args)
{
	ClassAC acobj=new ClassAC();
    Thread t1 = new Thread(acobj);
    
	t1.start();
	t1.setName("first-thread");
	t1.setPriority( 1);
    //t1.run();
	Thread t2=new Thread(acobj);
	t2.setName("second-thread");
	t2.start();
	t2.setPriority(10);
	//t2.run();
	
}
}
