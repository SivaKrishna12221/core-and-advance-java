package pack1;

public class SquareOrRectangle
{
	void check(int length,int breadth)
	{
		System.out.println("check if its square or rectangle");
		if(length != breadth)
		{
			System.out.println("it is a rectangle");
		}
		else
		{
			System.out.println("it is square");
		}
	}
	public static void main(String[] args)
	{
		SquareOrRectangle aobj=new SquareOrRectangle();
		aobj.check(12,10);
	}

}
