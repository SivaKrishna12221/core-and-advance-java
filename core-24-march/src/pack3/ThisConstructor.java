package pack3;

public class ThisConstructor 
{
	void meth1()
	{
		System.out.println("hi");
	}
	ThisConstructor()
	{
		this(100);/*calling a parameterized constructor by using this constructor.
		*we need to use this() only inside a constructor that too as a FIRST STATEMENT;
		
		 */
		this.meth1();//calling the present class method by using this constructor
		System.out.println("Default Constructor");
	}
	ThisConstructor(int a)
	{
		System.out.println("Parameterized constructor:"+a);
	}
	public static void main(String[] args) 
	{
		new ThisConstructor();
	}
}
