package javatpointMultithreding;

public class ClassAmountWithDraw_wait_notify 
{
  int amount=10000;
  synchronized void withdraw(int wmoney)
  {
	  System.out.println("going to withdraw");
	  if(amount<wmoney)
	  {
		  System.out.println("insuffiecient balance");
		  try
		  {
			 
			  wait();//here release the lock ,and wait to invoke notify()//synchronization stop here//and gives to one more thread
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  
	  }
		  
	  int remainbalance=this.amount-wmoney;
	  System.out.println("withdraw successfully  your balance is:"+remainbalance);
		
	  
	 
  }
  synchronized void deposit(int dmoney)
  {
	  System.out.println("depositing money");
	 this.amount+=dmoney;
	 System.out.println("deposited successfully Your main balance is "+this.amount);
	 notify();//here synchronized method again start ..wait() 
  }
  public static void main(String[] args) 
  {
	final  ClassAmountWithDraw_wait_notify  c=new ClassAmountWithDraw_wait_notify ();
	Thread t1 =new Thread()//for same class no need to add and also here we have already created one object
			{
		public void run()
		{
			c.withdraw(11000);
		}
			};
	    t1.start();
   Thread t2=new Thread()
		   {
	   public void run()
	   {
		   c.deposit(2000);
	   }
		   };
		   t2.start();
}
}
