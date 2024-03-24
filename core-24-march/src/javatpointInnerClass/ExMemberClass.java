package javatpointInnerClass;

public class ExMemberClass 
{
  int a=10;
  public class one
  {
	  public void meth1()
	  {
		  System.out.println(a);
	  }
  }
  public static void main(String[] args) {
	ExMemberClass ex=new ExMemberClass();
	ExMemberClass.one o=ex.new one();
	o.meth1();
	
}
}
