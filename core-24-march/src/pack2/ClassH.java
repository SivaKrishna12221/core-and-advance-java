package pack2;

public class ClassH 
{
	void meth1()
	{
		System.out.println("meth 1 () called");
	}
	void meth2()
	{
		System.out.println("meth2() called");
	}
	ClassH()//
	{
		System.out.println("non-parameterized  constructor called");
		new ClassH(100).meth2();//calling a parameterized constructor a=100
	
	}
	ClassH(int a)
	{
		System.out.println("parameterized constructor:"+a);
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		new ClassH().meth1();
		System.out.println("End");
		
	}
	

}
