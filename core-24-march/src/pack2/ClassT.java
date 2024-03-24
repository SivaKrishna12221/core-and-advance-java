package pack2;

public class ClassT 
{
	public static void main(String[] args)
	{
		int a=34;
		int b=21;
		int c=a++ + ++b;//35 + 22 =57
		int d=--a + --b + c--;//33+20+56=109
		int e=a+ +b + +c + d--;//34+21+57+108=220
		int f=-a+b-- +-c - d++;//-34+20-57-110=-181
		int sum= a+b+c+d+e+f;//34+21+57+109+220-181
		System.out.println("sum="+sum);
		
	}

	
}
