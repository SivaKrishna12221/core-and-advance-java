package pack4;

public class Class2 extends Class1
{
	void meth2()
	{
		System.out.println("Class2 method");
		super.meth1();
	}
	void meth3()
	{
		System.out.println("meth3() called");
	}
	Class2()//calling from main
	{
		System.out.println("Class2 default constructor");
		super.meth1();//again here executing super ..default constructor
		this.meth3();
	}
	Class2(int a)//calling from main()
	{
		super();//calling defalut super class which are  present parent class
	
		System.out.println("Class2 parameterized constructor:"+a);
	}
	public static void main(String[] args) 
	{
		Class2 bobj=new Class2(500);//calling parameterized constructor
		bobj.meth2();
		new Class2();
		
		
	}
	
	

}
