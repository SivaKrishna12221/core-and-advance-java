package javatpointMultithreding;

public class ClassNamingThread extends Thread
{
  public  void run()
  { 
	 String name= Thread.currentThread().getName();
	 for(int i=1;i<=4;i++)
	 {
		 System.out.println(name);
	 }
  }
  public static void main(String[] args) {
	ClassNamingThread t1=new ClassNamingThread();

	
	t1.setName("siva");
	t1.start();
}
} 
