package pack2;

public class ClassFinalB extends ClassfinalA//c.e because final classes can't be inherit
{
	void meth1()
	{
		System.out.println("ClassB method");
	}
public static void main(String[] args) 
{
 ClassFinalB bobj=new ClassFinalB();
 bobj.meth1();
	
 /*
  * we can't inherit a private methods .but we can perform method overriding
  * we can inherit a final methods but we can't overriding
  */
}
}