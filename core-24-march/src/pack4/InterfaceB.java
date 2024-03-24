package pack4;

public interface InterfaceB 
{
	void show();
	
	default void meth1()
	{
		System.out.println("executing  default methods inside a Interface");
		meth3();
	}
	static void meth2()
	{
		System.out.println("executing static method inside a Interface");
	}
	private void meth3()
	{
		System.out.println("executing private methods inside a Interface");
		
	}
	//we cannot create a constructor inside a interface we cannot overidden constructors
	public static void main(String[] args) 
	{
		System.out.println("executing main inside a Interface");
		InterfaceB.meth2();
	}

}
