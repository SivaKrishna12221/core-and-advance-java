package pack3;

public class MathTable 
{
	void meth1(int num)
	{
		System.out.println("Mutiplication table");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
			
		}
		
	}
	public static void main(String[] args)
	{
		new MathTable().meth1(15);
	}

}
