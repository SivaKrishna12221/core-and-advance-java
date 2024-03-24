package pack2;

public class ClassQ 
{ 
	void meth1()
	{
		int a=15;
		System.out.println(a++);//15 a=16
		a++;//a=17
		System.out.println(a++);//17 a=18
		System.out.println(++a);//19 a=18
		System.out.println(a--);//19 a=18
		System.out.println(--a);//17 a=17
		a=a++;//17
		System.out.println("a value:"+a);//17
		System.out.println(++a);//18 a=18
		System.out.println(--a);//17 a=17
		a--;//a=16
		System.out.println(--a);//15 a=15
		System.out.println(a--);//15 a=14
		System.out.println(a--);//14 a=13
		System.out.println(a);//13
	}
	public static void main(String[] args)
	{
		new ClassQ().meth1();
		
	}
}

