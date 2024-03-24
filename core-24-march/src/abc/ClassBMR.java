package abc;

public class ClassBMR extends ClassAMR
{
  public  void meth1(int a,int b)//child method should not be more restrictive than the parent methods
  {
	  System.out.println("ClassBMR meth1()");
	  System.out.println(a+b);
  }
  static void meth2()
  {
	  System.out.println(" ClassBMRstatic meth2()");
  }
  private void meth3()
  {
	  System.out.println("ClassBMRstatic private method meth3()");
  }
  public static void main(String[] args) {
	ClassBMR bmr=new ClassBMR();
	bmr.meth1(10,20);
	ClassAMR amr=new ClassAMR();
	amr.meth1(30,40);
	
			
}
}
