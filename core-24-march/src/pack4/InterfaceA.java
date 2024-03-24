package pack4;

public interface InterfaceA 
{
	void meth1();
	default void meth2()
	{
		System.out.println("Interface A default method");
		meth4();
	}
	static void meth3()
	{
		System.out.println("Interface A static method");
	}
	private void meth4()
	{
		System.out.println("Interface A Private method");
	}
	public static void main(String[] args)
	{
	   System.out.println("Interface A main");
	   //new InterfaceA();//c.e interface can't be instantiated
	   InterfaceA.meth3();//we can call static methods by using Interface name like class name;
	   
	}
	

}
