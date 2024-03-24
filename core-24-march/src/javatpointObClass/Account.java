package javatpointObClass;

public class Account
{
 int ac_num;
 String name;
 float amount;
 void insert(int a,String n,float money)
 {
	ac_num=a;
	name=n;
	amount=money;
 }
 void deposit(int m)
 {
	 amount=amount+m;
	 System.out.println(m+"deposited .Your balance is:"+amount);
 }
 void withdraw(int w)
 {
	
	if(amount<w)
	{
		System.out.println("insufficient balance");
	}
	else
	{
		amount=amount-w;
		System.out.println("withdrawn"+w);
	}
 }
 void checkBalance()
 {
	 System.out.println(amount);
 }
 void display()
 {
	 System.out.println(ac_num+" "+name+" "+amount);
 }
}
