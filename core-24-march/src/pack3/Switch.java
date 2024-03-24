package pack3;

public class Switch 
{
	void meth1()
	{
		int a=20; 
		byte b=40;
		char c='B';
				
		switch(b)
		{
		case 66:
			System.out.println("case 66 executed");
			break;
		case 10:
			System.out.println("case 10 executed");
		break;
		case 20:
			System.out.println("case 20 executed");
			break;
		
		case 30:
			System.out.println("case 30 executed");
			break;
		case 40:
			System.out.println("case 40 executed");
			break;
		case 50:
			System.out.println("case 50 executed");
			break;
		default:
			System.out.println("no case labels got matched to the key value");
		
			
			
		}
		
	}
	public static void main(String[] args) 
	{
		Switch aobj=new Switch();
		aobj.meth1();
	}

}
