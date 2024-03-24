package pack4;

public class ClassK extends ClassJ
{
	void meth2()
	{
		System.out.println("implementing multi-level inheritance");
		
	}
	/*
	 * Multi-level inheritance
	 * In multi-level inheritance a child class object will access both parent 
	 * class and grand parent class objects.
	 * 
	 */
	public static void main(String[] args) 
	{
	  ClassK kobj =new ClassK();
	  kobj.meth1();
	  kobj.meth2();
	 
	}

}
