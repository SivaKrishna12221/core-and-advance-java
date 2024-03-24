package pack2;

public class ClassX 
{
	int c;//-57
	static int e;
	ClassX()
	{
		System.out.println(++c);//1 c=1 //1 c=1
		System.out.println(++e);//1 c=1//2 c=2
	}
	public static void main(String[] args) 
	{
		int a=34;
		int b=21;
		new ClassX().c-=a++ + ++b;//35+22=c=-57
		int d=--a + --b +new ClassX().c--;//d=33+20=53,//-1//52
		e=a + +b +  +new ClassX().c+d--;//34+21-57-2=-4=e
		int f=-a + b-- + -new ClassX().c - d++;//-34+20+57-=41
		int sum = a+b+ new ClassX().c +d+e+f;//34+21-57-3-4+41=32
		System.out.println("sum="+sum);//32
		
	}

}
