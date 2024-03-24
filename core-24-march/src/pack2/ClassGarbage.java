package pack2;

public class ClassGarbage 
{
	void meth1()
	{
		System.out.println("meth1 () called");
		ClassGarbage obj=new ClassGarbage();
	}
	//@override
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args)
	{
		ClassGarbage aobj1=new ClassGarbage();
		ClassGarbage aobj2=new ClassGarbage();
		aobj1.meth1();
		aobj2=aobj1;
		aobj1=null;
		System.gc();
	}

}
