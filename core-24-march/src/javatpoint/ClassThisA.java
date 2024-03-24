package javatpoint;

public class ClassThisA extends ClassThis
{
  void meth2()
  {
	  super.meth1();
	  System.out.println("child method");
  }
  ClassThisA()
  {
	 super(10,20);
	 System.out.println("child class constructor");
	 
  }
  public static void main(String[] args) 
  {
	ClassThisA t=new ClassThisA();
	t.meth2();
	
}
}
