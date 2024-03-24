package pack2;

public class ClassAJ 
{
	void Implicit()
	{
		byte b=10;
		System.out.println("byte value is"+b);
		short s=b;
		System.out.println("short value is"+s);
		s++;
		int i=s++;//11
		System.out.println("int value is "+i);
		System.out.println("short value is "+s);
		long l=i;
		System.out.println("long value is "+(--l));
		float f=1;
		System.out.println("The value of float is "+(f+b));
		double d=(--f);
		System.out.println("The value of double is"+d);
		
		show();
		
		if(!(d==f))
		{
			System.out.println("equal");
		}
	   
	   else
	   {
		System.out.println("not equal");
	   }
	}	
	public static void main(String[] args)
	{
		ClassAJ a=new ClassAJ();
		a.Implicit();
		
	
	}
	static void show()
	{
		char c='A';//65
		int a=++c;//66
		System.out.println(a);
		ClassAJ obj=new ClassAJ();
		String s=obj.meth1();
		System.out.println(s);
		
		
	}
	String meth1()
	{
		String s="Implicit casting is done by the compiler automatically";
		 return s;
	}

}
