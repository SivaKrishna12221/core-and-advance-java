package javatpointObClass;

public class TestAccount
{
  public static void main(String[] args) {
	
 Account ac=new Account();
 ac.insert(1012223,"siva",10000);//here insert the data with the help of methods
 ac.display();
 ac.withdraw(4000);
 ac.checkBalance();
 ac.deposit(2000);
 
}
}