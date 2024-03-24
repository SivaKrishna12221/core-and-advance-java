package pack2;

public class ClassG 
{
	int a=10;
	static int b=20;
	
	int x;
	int y;

	void meth1()
	{
	 System.out.println("meth1() called");	
	  int c=30;
	 System.out.println("instance variable:"+a);
	 System.out.println("instance variable:"+new ClassG().a);
	 System.out.println("====================");
	 System.out.println("static variable:"+b);
	 System.out.println("static variable:"+new ClassG().b);
	 System.out.println("static variable:"+ClassG.b);
	 System.out.println("=======================");
	 System.out.println("local variable:"+c);
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int a=100;
		int b=200;
		System.out.println("instance variable:"+new ClassG().a);
		System.out.println("instance variable:"+new ClassG().b);
		System.out.println("static variable:"+ClassG.b);
		System.out.println("=================");
		System.out.println("local variable a:"+a);
		System.out.println("local variable b:"+b);
		
		
		
	}
	void meth3()
	{
		//int z;
		System.out.println("meth3() called");
		System.out.println("x value:"+x);
		System.out.println("Y value:"+y);
	//system.out.println("z value:"+z);
		//compile time error because local variable is not initialized
		
	}
	public static void main(String[] args)
	{ 
		System.out.println("start");
		ClassG aobj=new ClassG();
		aobj.meth1();
		new ClassG().meth2();
		aobj.meth3();
		System.out.println("end");
                  
		
	}
	
	

}
