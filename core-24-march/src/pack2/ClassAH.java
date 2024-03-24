package pack2;

public class ClassAH 
{
	int x=12;
	static int y=45;
	void m1()
	{
		System.out.println("instance method m1()");
		
	}
	void m2()
	{
		System.out.println(x);
		new ClassAH(500).m1();
		System.out.println(y);
		m3();
		System.out.println("instance method m2()");
	}
	static void m3()
	{
		System.out.println("static method m3()");
		
	}
	ClassAH(int a)
	{
		y=a;//500
	}
    ClassAH()
    {
    	y=50-38;//22
    }
    public static void main(String[] args)
    {
    	System.out.println(y);
    	m3();
    	ClassAH a=new ClassAH();
    	System.out.println(a.x);
    	a.m2();
    	
		
	}
}
