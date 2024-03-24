package pack2;

public class ClassAI
{
	void implicit()
	{
		byte b=50;
		int i1=b;
		System.out.println("byte value:"+b);
		System.out.println("int value:"+i1);
		System.out.println("-----------");
		char c='A';
		int i2=c;
		//int&char both are compatable datatypes
		System.out.println("char value:"+c);
		System.out.println("int value:"+i2);
		System.out.println("--------------");
		short s=10;
		float f=s;
		System.out.println("short value:"+s);
		System.out.println("float value:"+f);
	}
	void explicit()
	{
		int x=50;
		byte b=(byte)x;
		System.out.println("int value:"+x);
		System.out.println("byte value:"+b);
		System.out.println("-----------");
		
		int y=500;
		byte b1=(byte)y;
		System.out.println("int value:"+y);
		System.out.println("byte value:"+b1);
		System.out.println("---------------");
		//[minumumRange+(result-maximumRange-1)]//
		
		float f=10.9999f;
		byte b2=(byte)f;
		System.out.println("float value:"+f);
		System.out.println("byte value:"+b2);
		
	}
	public static void main(String[] args)
	{
		ClassAI aobj=new ClassAI();
		aobj.implicit();
		aobj.explicit();
	}

}
