package javatpointInter;

public class ClassTestI implements Account,Saving
{
  public void save() {
	  System.out.println("saving ");
  }
  public  void account() {
	  System.out.println("account ");
  }
  public static void main(String[] args)
  {
	Account ac=new ClassTestI();
	ac.save();//upcasting
	ac.account();
}
}
