package pack2;

public class ClassAB
{
	int x=10;
	public static void main(String[] args) 
	{
		int x=20;
		System.out.println(x);
		System.out.println(new ClassAB().x);
	}
	static 
	{
		int x=30;
		System.out.println(x+" ");
	}

}
