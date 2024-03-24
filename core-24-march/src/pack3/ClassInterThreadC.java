package pack3;

public class ClassInterThreadC
{
	int amount=10000;
	synchronized  void with_draw(int amount)throws InterruptedException
	{
		if(this.amount<amount)//10000<15000
		{	
			System.out.println("insuffient balance");
			wait(20000);//pause and continue the execution
			System.out.println("Amount credited");
			this.amount-=amount;
			System.out.println("with draw succesfully /nBalance "+this.amount);
	 	}
		else
		{
			this.amount -=amount;
			System.out.println("with draw succesfully /nBalance"+this.amount);
		}
	}
	synchronized void deposit(int amount) 
	{
		this.amount+=amount;
		System.out.println("deposit "+amount+"successfully /nBalance "+this.amount);
	//notify();
	//notifyAll();
	}
	
	

}
