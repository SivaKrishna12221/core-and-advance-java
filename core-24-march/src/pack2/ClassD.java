package pack2;

public class ClassD 
{
	 public int meth1()
	{
		System.out.println("meth 1() called");
		System.out.println("int and char both are compatable datatypes");
		return 'C';//A=67
		
	}
	 public int meth2(int e)//main()'a'
	{
		System.out.println("meth2() called");
		System.out.println("a value:"+e);//
		return 'A'-5;//65-5=60;
	}
	boolean meth3(int i)//main() i=15
	{
		System.out.println("meth3() called");
		if (i<=100)
		{
			System.out.println("if block executed");
			return true;
			//System.out.println("hi");
		}
		else
		{
			System.out.println("else block is executed");
			return false;
			//system.out.println("hello");
		}
	}
	void meth4()
	{
		System.out.println("meth4() called");
		return;
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		ClassD aobj=new ClassD();//creating a object
		int val1=aobj.meth1();//calling a method
		System.out.println("meth1() is returning :"+val1);
		System.out.println("---------------");
		int val2=aobj.meth2('a');//calling a method()
		System.out.println("meth2() is returning :"+val2);
		System.out.println("--------------");
		boolean result=aobj.meth3(236873);//calling a method
		System.out.println("meth3() is returning:"+result);
		System.out.println("-----------------");
		System.out.println("End");
				
	}
	

}
