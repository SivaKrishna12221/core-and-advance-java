package pack2;

public class ClassL
{
	public ClassL()//calling from main ClassL constructor.
	{
		System.out.println("sunday");
		ClassL obj=new ClassL(10);//creating a parameterized constructor
		System.out.println("Tuesday");
		String s=obj.display("Challage Accepted"); //creating string s 
		System.out.println(s);
	}
	public ClassL(int temp)//calling from ClassL (10) temp=10;
	{
		System.out.println("saturday");
		ClassL aobj=new ClassL(10,20);//creating a parameterized constructor..
		int a =aobj.meth1()+temp;//100+10
		System.out.println("===========>"+(a+aobj.meth2()));
		System.out.println("monday");
		
	}
	String display(String s)
	{
		System.out.println("In the next statement I am returning string value");
		return s;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public ClassL(int data ,int temp)//calling from ClassL(10,20)
	{
		System.out.println("Thursday");
		System.out.println("=====>"+(data+new ClassL("hi").meth2()+temp));
		                            //10+//creating string con.99+20
	}
	ClassL(String s)//calling from ClassL("hi")
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		ClassL aobj=new ClassL();//creating an object,initialize with the help of constructor
		System.out.println("output verified");
		
	}

}
