package pack3;

public class ClassYield2       
{
  public static void main(String[] args)throws InterruptedException
  {
	ClassYield1 aobj=new ClassYield1();
	aobj.start();
	//aobj.join();
	Thread.yield();
	/*
	 * 1)Yield () provides a mechanism to inform thread schedular.That the current 
	 * thread is willing to hand over its current use of processor,but it would  like
	 *  be schedules back soon as possible.
	 *2) If we are using the yield .Then the selected thread a chance to the other
	 *thread with the same priority to execute.
	 *3) If there are several waiting Threads with same priority ,then we can't 
	 *expect which thread get chance for its execution.
	 *we can't guess again when the yielded thread will resume its execution.
	 */
	
	for(int i=1;i<=5;i++)
	{
		
		System.out.println("ClassYield 2 "+i);
	}
}
   

}