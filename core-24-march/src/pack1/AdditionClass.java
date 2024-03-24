package pack1;

public class AdditionClass 
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition :"+c);
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		AdditionClass aobj=new AdditionClass();
		aobj.add();
		System.out.println("end");
	}
	/*
	 * start 
	 * addition:30
	 * end
	 * 
	 */

}
