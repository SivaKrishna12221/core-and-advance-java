package pack3;

public class While
{
	void meth1(int a)
	{
		System.out.println("---meth1()----");
		while(a<=5)
		{
			System.out.println("a value:"+a);
			a++;
		}
		System.out.println("meth1() execution completed");
	}
	void meth2(int i)
	{
		System.out.println("-------meth2()---------");
		while(i<=3)
		{
			
				System.out.println("i value:"+i);
			
			i++;
			System.out.println("meth2() execution completed");
		}
	}
	void meth3(int a)
	{
		System.out.println("====meth3()-----");
		do
		{
			System.out.println("a value:"+a);
			a++;
			
		}
		while(a<=5);
		System.out.println("meth4() execution completed");
	}
	void meth5(int a,int b,int c,int d)
	{
		if(a>b)
		{
			System.out.println("if block executed");
			switch(c)
			{
			case 30:
				System.out.println("case 30 executed");
				while (d<=20)
				{
					System.out.println("d value:"+d);
					d++;
				}
				break;
				default:
					System.out.println("c value  is not 30");
					break;
			}
		}
		else 
		{
			System.out.println("else block executed");
		}
	}
	void meth4(int x)
	{
		System.out.println("meth4()");
		while(true)
		{
			System.out.println("x value:"+x);
			x++;
			
			
		}
	}
public static void main(String[] args) 
{
	new While().meth1(1);
	new While().meth2(1);
	new While().meth3(10);
	new While().meth5(5,10,30,15);
	new While().meth4(1);
}
}
