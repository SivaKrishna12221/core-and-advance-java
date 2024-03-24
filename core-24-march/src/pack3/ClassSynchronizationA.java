package pack3;

public class ClassSynchronizationA extends Thread
{
 public void run()
 {
	 criticalResource();
	 

 }
  
 synchronized void criticalResource()
 
 {
	 String name=Thread.currentThread().getName();
	 System.out.println(name+" has entered criticalResources()");
	 for (int i=1;i<=5;i++)
	 {
		 System.out.println(name+":"+i);
	 }
	 System.out.println(name+" has completed its execution");
 }
 public static void main(String[] args) 
 {
	ClassSynchronizationA aobj=new ClassSynchronizationA();
	Thread t1=new Thread(aobj);
	Thread t3=new Thread(aobj);
	Thread t2=new Thread(aobj);
     t1.start();
     t3.start();
     t2.start();
	t1.setName("first-method");
	t3.setName("second-method");
	t2.setName("third -method");
}
}
