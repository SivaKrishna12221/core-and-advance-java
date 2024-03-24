package javatpointMultithreding;

public class ClassSleepj extends Thread
{
  public void run()
  {
	  for(int i=1;i<=4;i++)
	  {
		  try
		  {
			 sleep(1000) ;
		  }
		  catch(InterruptedException ie)
		  {
			  System.out.println(ie);
		  }
		 
		  System.out.println(i);
	  }
  }
  public static void main(String[] args) {
	  ClassSleepj t1=new ClassSleepj();
	  ClassSleepj t2=new ClassSleepj();
	  t1.run();
	  t1.run();
		/*
		 * try {
		 * 
		 * for(int j=1;j<=5;j++) { t1.sleep(1000); System.out.println(j); } }
		 * catch(InterruptedException ie) { System.out.println(ie); }
		 */
}
}
