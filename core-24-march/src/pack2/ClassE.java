package pack2;

public class ClassE 
{
	int meth1()
	{
		System.out.println("meth1() called");
		return 100;
	}
	static void meth2()
	{
		System.out.println("static meth2() called");
	}
	    public static void Main (String[] args)
	{
		int val=new ClassE().meth1();//Calling a meth1()
		System.out.println("=====>"+val);
		 new  ClassE().meth1();
		ClassE.meth2();//calling a meth2() by using static method with help of direct class name .
		ClassE.meth2();
	}

}
