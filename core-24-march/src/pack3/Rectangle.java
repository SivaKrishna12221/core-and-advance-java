package pack3;

public class Rectangle
{
	void meth1(int length,int breadth) 
	{
		if(length!=breadth)
		{
			System.out.println("It is a Rectangle");
			
		}
		else
		{
			System.out.println("It is a Square");
		}
	}
	public static void main(String[] args)
	{
		new Rectangle().meth1(4, 5);
	}

}
