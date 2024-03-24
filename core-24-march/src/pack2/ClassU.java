package pack2;

public class ClassU 
{
	void meth1(int a,int b,int c)
	{
		System.out.println("addition:"+(a+b+c));
		new ClassU().meth2(20,30);
	
	}
	void meth2(int a, int b)
	{
		System.out.println("substraction:"+(a-b));
		
	}
	ClassU()
	{
		System.out.println("division:"+(300/30));
	}
	public ClassU(String s)
	{
		System.out.println(s+(20*30));
		
	}
	public static void main(String[] args) 
	{
		new ClassU("multiplication:").meth1(10,20,30 );
		
	}

}
