package javatpointInter;

public class SBI implements Bank,Saving
{
  public void rateOfIntrest()
  {
	  System.out.println("sbi");
  }
  public void meth1()
  {
	  System.out.println("meth1");
  }
  public static void main(String[] args)
  {
	Bank b=new SBI();
	b.rateOfIntrest();
	
}
@Override
public void save() {
	// TODO Auto-generated method stub
	
}
}
