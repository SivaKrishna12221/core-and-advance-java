package pack3;

	public class Discount 
{
	void bill(int units)//20 
	
	{
		int finalbill=units*100;//2000
		if (finalbill>=1000)
		{
		int discount=finalbill*10/100;
		System.out.println("finalbill="+(finalbill-discount));
		System.out.println("congrats you received "+discount+" as discount");
		}
		else
		{
			System.out.println("your bill is:"+finalbill);
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		Discount aobj=new Discount();
		aobj.bill(20);
		
	}

}
