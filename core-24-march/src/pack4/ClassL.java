package pack4;

public class ClassL extends ClassK
{
  void meth3()
  {
	  System.out.println("In multi-level inheritance a child class object  will access both parent class and grand parent class");
  }
  public static void main(String[] args) 
  {
	  ClassL lobj=new ClassL();
	  lobj.meth1();
	  lobj.meth2();
	  lobj.meth3();
	
}
}
