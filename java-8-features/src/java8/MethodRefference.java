package java8;

interface MyInterface2
{
	public void meth2();
}
class MethodRef
{
  static void meth1()
  {
	  System.out.println("method ref");
  }
}
class InstanceMethodRefference
{
	public void meth3()
	{
		System.out.println("instance method executing using method referrence");
	}
}
public class MethodRefference {

	public static void main(String[] args) {
		
	
		/*MyInterface2 mi=MethodRef::meth1;
		mi.meth2();*/
	     InstanceMethodRefference imr=new InstanceMethodRefference();
	     MyInterface2 my=imr::meth3;
	    my.meth2();
		
}
}