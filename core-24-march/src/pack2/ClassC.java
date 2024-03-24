package pack2;

public class ClassC
{
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(10);
	}
	int meth2(int a,int b)//main() a=9,b=1
	{
		System.out.println("meth2()called");
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		return a+b;
		//System.out.println("hello world");
		//compile error because it is unreachable code
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		ClassC aobj=new ClassC();//creating a object
		aobj.meth1();//calling a method
		System.out.println("------------");
		int val =aobj.meth2(9,1);//calling a method
		System.out.println("====>"+val);
		System.out.println("End");
		
	}

}
