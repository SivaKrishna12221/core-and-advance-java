package pack2;

public class ClassJ
{
	int meth1(int a,int b)//a=10,b=20
	{
		System.out.println(a);
		System.out.println(a+b);
		return(a+b)+ 10;//30+10=40 
	}
	String meth2(String data)//calling from main s=is
	{
		System.out.println(100);
		System.out.println(new ClassJ().meth1(10, 20)+60);
		return"Java "+data;
	}
	ClassJ()
	{
		System.out.println("HI");
	}
	ClassJ(String s)//calling from main.s=hello
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		System.out.println(new ClassJ("hello").meth2("is")+"awesome");
		
	}
	

}
