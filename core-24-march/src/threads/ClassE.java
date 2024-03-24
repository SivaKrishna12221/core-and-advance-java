package threads;
/*
 * Sleep():
 * If want a thread to pause performing any action for a given amount 
 * of time we should use sleep method
 */
public class ClassE 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.out.println("j");
	Thread.sleep(500);//5 sec //default thread executed
	System.out.println("a");
	Thread.sleep(400);
	System.out.println("v");
	Thread.sleep(300,100);//specified milliseconds and nanoseconds
	System.out.println("A");
}
}
