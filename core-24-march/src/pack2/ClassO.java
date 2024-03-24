package pack2;

public class ClassO 
{
	void show()
	{
		System.out.println("show() from ClassB");
	}
	public static void main(String[] args) 
	{
		new ClassO().show();
		new ClassN(500).meth1();
		
	}

}
