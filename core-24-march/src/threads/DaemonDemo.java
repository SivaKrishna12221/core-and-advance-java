package threads;

public class DaemonDemo extends Thread
{
 public void run()
 {
	 int i=0;
	 while(true)
	 {
		 i=i+	1;
		 System.out.println("deamon:"+i);
	 }
 }
 public static void main(String[] args)
 {
	 DaemonDemo d=new DaemonDemo();
	 	//d.setDaemon(true);
	 	//d.start();
	  	Thread t1=new Thread(d);
	 	t1.setDaemon(true);
	 	t1.start();
	 	for(int i=1;i<=20;i++)
	 	{
	 		System.out.println("main:"+i);
	 	}
	 	System.out.println("end of main");
 }
}
