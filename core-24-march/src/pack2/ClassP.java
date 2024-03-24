package pack2;

public class ClassP 
{
	void meth1()
	{
	 int a=10;
	 System.out.println(a);//10
	 System.out.println(a++);//10 a=11
	 System.out.println(a);//11 
	 System.out.println(++a);//12 a=12
	 System.out.println(--a);//11 a=11
	 System.out.println(a--);//11 a=10
	 System.out.println(a);//10
	}
	public static void main(String[] args)
	{
		new ClassP().meth1();
		
	}

}
