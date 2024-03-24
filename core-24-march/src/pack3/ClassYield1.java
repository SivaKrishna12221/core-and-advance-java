package pack3;

public class ClassYield1 extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("ClassYield 1 " +i);
		}
		System.out.println("===============");
	}

}
