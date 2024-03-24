package javatpointInnerClass;

public class MethodLocalClass 
{
  int a=10;
  public void meth1()
  {
	   class ClassLocal
	  {
		  void meth2()
		  {
			  System.out.println(a);
		  }
		  
	  }
	   ClassLocal local=new ClassLocal();
	   local.meth2();
  }
  public static void main(String[] args) {
  MethodLocalClass mlc=	new MethodLocalClass();
  mlc.meth1();
}
}
