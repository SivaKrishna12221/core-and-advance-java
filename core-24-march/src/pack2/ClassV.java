package pack2;

public class ClassV 
{
	void person(int age)
	{
		if(age!=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}
	}
	void eligibility(int age)
	{
		if(!(age>=21 || age<=35))
		{
			System.out.println(" person is eligible for the exam");
		}
		else
		{
			System.out.println("person is not eligible for the exam");
		}
	}
	
	public static void main(String[] args)
	{
		ClassV aobj=new ClassV();
		//aobj.person(21);
		aobj.eligibility(30);
		
	}

}
