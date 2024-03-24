package pack3;

public class ThisKey 
{
	void meth1()
	{
		System.out.println("meth1() called");
		this.meth1();
		
	}
	void meth2()
	{
		System.out.println("meth2 () called");
		this.meth3();
	}
	void meth3()
	{
		System.out.println("meth3() called");
		this.meth4();
	}
	void meth4()
	{
		System.out.println("meth4() called");
	}
	public static void main(String[] args)
	{
		//this.meth1();// C.E error because we cannot use this keyword in static area.
		new ThisKey().meth1();
		
	}

}
