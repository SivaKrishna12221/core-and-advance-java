package javatpointAbs;

public  class ClassAbb extends ClassAb
{
  public void meth1()
  {
	  System.out.println("meth1 called");
  }
  public void meth2()
  {
	  System.out.println("meth2 called");
  }
  public void meth4()
  {
	  System.out.println("meth4 called");
  }
  public static void main(String[] args) 
  {
   ClassAb a=new ClassAbb();
	a.meth1();
	a.meth2();
	a.meth3();
	a.meth4();
	
}
  
}
