package pack3;

public class JumpStatements 
{
	void meth1()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				//continue;
				return;
				
			}
			{
				System.out.println("i value:"+i);
			}
			
		}
		System.out.println("compiler came out from the for loop");
		
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		new JumpStatements().meth1();
		System.out.println("end");
		
	}

}
