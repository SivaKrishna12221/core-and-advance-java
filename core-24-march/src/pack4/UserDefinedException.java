package pack4;
import java.util.Scanner;

public class UserDefinedException 

{
	static double current_balance=1000;
	
	public static void main(String[] args) 
	{
    Scanner	sc=new Scanner(System.in);
    System.out.println("Please enter required amount:");
    int n=sc.nextInt();
    double balance=current_balance-n;
    try
    {
    	if(current_balance<n)
    	{
    throw new MinimumAccountBalance("insufficient funds ! your current balance is "+current_balance);
    	}
    	else
    	{
    		System.out.println("please take your money:"+n);
    	}
    	System.out.println("your current balance is :"+balance);
    	
    	
    }
    catch( MinimumAccountBalance e)
    {
    	e.printStackTrace();
    }
    
    
		
	}
	
 
}
