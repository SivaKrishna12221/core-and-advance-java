package pack2;

public class ClassW
{
	int a;
	static int b;
	 public ClassW()
	{
		System.out.println("Instance variable:"+(++a));
		System.out.println("Static variable:"+(++b));
		System.out.println("------------------");
	}
	public static void main(String[] args) 
	{
		new ClassW();
		new ClassW();
		new ClassW();
	}
		
	}

}
