package javatpointMultithreding;

public class Table 
{
  synchronized void printTable(int n)	
  {
	  for(int i=1;i<=5;i++)
	  { 
		 System.out.println(i*n); 
	  }
	  try
	  {
		Thread.sleep(1000);
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println(e);
	  }
	  
  }

}
