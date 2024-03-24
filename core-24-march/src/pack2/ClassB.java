package pack2;

public class ClassB 
{
 
void meth1()
{
	
	System.out.println("meth1() called");
}
public static void main(String[] args) 
{
	ClassB obj1=new ClassB();
	ClassB obj2=new ClassB();
	obj1.meth1();
	obj1=null;
	System.gc();
	//garbage collector will be calling the finalise()
	
}
}