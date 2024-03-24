package threads;
/*
 * Inter thread communication :
 * Two threads can communicate with each other by using wait() method
 * notify() method and notifyall() method .This process is known a
 * Inter Thread communication.
 * 
 */
public class ClassK 
{
  int mainBalance=10000;
  synchronized void with_draw(int w_amount)throws InterruptedException
  {
	  
	  if(this.mainBalance<w_amount)//if true=>thread t2 execute 
		  
	  {
		  System.out.println("insufficient balance");
	  
	      wait();//current thread stop waiting for the execution of another thread
	     
	      System.out.println("amount credited");
		  this.mainBalance+=w_amount;
		  System.out.println("Withdraw successfull /n Blance is"+mainBalance);
	  }
	  else
	  {
		  this.mainBalance-=w_amount;
		  System.out.println("withdraw succesffull /n Balance is"+mainBalance);
	  }
		 
  }
  
  synchronized void deposit(int d_amount)
  {
	  mainBalance=mainBalance+d_amount;
	  System.out.println("deposited successfully \n main balance is:"+mainBalance);
	  notify();//wakesup a single thread that is waiting
	  //notifyAll();
  }
}
