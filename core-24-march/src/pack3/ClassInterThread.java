package pack3;

import java.util.Scanner;

public class ClassInterThread 
{
  double amount=20000;
  Scanner sc=new Scanner(System.in);
  synchronized void with_draw(double wamount)
  {
	  System.out.println("i going to with draw money:"+wamount);
  
  if(this.amount<wamount)
  {
	  System.out.println("insufficient balance your balance is :"+this.amount);
	  try {
		   wait(10000);
		  System.out.println("credited money ");
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
  }
  this.amount-=wamount;
  System.out.println("your withdraw "+wamount+ "of money");
  System.out.println("with drawsuccesfully your remainging balance is:"+this.amount);
  
}
  synchronized void deposit(double damount)
  {
	  this.amount+=damount;
	  System.out.println("i am deposited "+damount);
	  System.out.println("deposited successfully your total amount is :"+this.amount);
	  //notify();
  }
  /*public static void main(String[] args) {
	  ClassInterThread  cit=new ClassInterThread ();
	  
	  Thread t1=new Thread()
			  {
		  public void run()
		  {
			  cit.with_draw(25000);
		  }
			  };
			  t1.start();
	 Thread t2=new Thread()
			 {
		 public void run()
		 {
			 cit.deposit(10000);
		 }
			 };
			 t2.start();
			 */
			 
}
 

