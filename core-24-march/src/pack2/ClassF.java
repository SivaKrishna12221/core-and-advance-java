package pack2;

public class ClassF 
{
	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	void meth1()
	{
		System.out.println("printing the default values of all the 8 primitive data types");
		System.out.println("-------------");
		System.out.println("integer value:"+i);
		System.out.println("byte value:"+b);
		System.out.println("short value:"+s);
		System.out.println("long value:"+l);
		System.out.println("-----------------");
		System.out.println("float value:"+f);
		System.out.println("double value:"+d);
		System.out.println("----------");
		System.out.println("char value:"+c);
		System.out.println("boolean value:"+flag);
	}
	void meth2()
	{
		int i1=10;
		int i2=20;
		int i3=i1+i2;
		System.out.println("integer value:"+i3);
		float f=5.3f;
		System.out.println("float value:"+f);
		char c=2;
		System.out.println("char value:"+c);
		
	}
	public static void main(String[] args)
	{
		ClassF aobj=new ClassF();
		aobj.meth1();
		aobj.meth2();
		
	}
	
	
}