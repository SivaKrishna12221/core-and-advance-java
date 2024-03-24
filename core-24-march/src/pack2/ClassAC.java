package pack2;

public class ClassAC
{
	int x=10;
	public static void main(String[] args) 
	{
		System.out.println("instance variable:"+new ClassAC().x);
		
	}
	static 
	{
		 int x=30;
		 System.out.println(x+" ");
	}

}
