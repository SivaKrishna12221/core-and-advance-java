package pack2;

public class ClassN 
{
	void meth1()
	{
		System.out.println("meth 1() called");
	
	}
	public ClassN(int a)//a=100,
	{
		System.out.println("Parameterized constructor:"+a);
		return;
	
	}
	private ClassN()
	{
		System.out.println("Default constructor of ClassN");
		return;
	
	}
	public static void main(String[] args)
	{
		new ClassN(100).meth1();//
		//new ClassN().meth2();
		new ClassN(10).meth1();
		//new ClassN(10)
		
	}

}
