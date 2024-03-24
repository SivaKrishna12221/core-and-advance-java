package pack3;

public class ForLoop 
{
	void meth1()
	{
		System.out.println("meth1() ");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value:"+i);
		}
		System.out.println("meth1 executed ");
	}
	void meth2()
	{
		System.out.println("meth2()");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("i value:"+i);
		    i++;
			
		}
		System.out.println("meth2() executed");
		
	}
	void meth3()
	{
		System.out.println("meth3()");
		
		for(int i=5;i<=10;i++)
		
			System.out.println("i value :"+i);
		
			System.out.println("meth3() executed");
		
	}
	void meth4()
	{
		System.out.println("meth4()");
		
		int i=11;
		for(;i<=15;)
		{
			System.out.println("i value:"+i);
			i++;
		}
		System.out.println("meth4() executed");
		
	}
	void meth5()
	{
		System.out.println("meth5()");
		
		int i=1;
		for(System.out.println("meth5()");i<3;System.out.println("@@@@@@@@@"))
		{
			System.out.println("i value:"+i);
			i++;
		}
		System.out.println("meth5() executed");
	}
	void meth6()
	{
		System.out.println("meth6()");
		{
			int i=11;
			for (System.out.println("hi"),System.out.println("hello");i<=15;
					System.out.println("java"),System.out.println("-----"))
			{
				System.out.println("i value:"+i);
				i++;
			}
			System.out.println("");
		}
	}
	int meth7()
	{
		System.out.println("meth7() called");
		return'A'-64;
	}
	void meth8()
	{
		System.out.println("------");
	}
	void meth9()
	{
		System.out.println("meth9()");
		for (int i=new ForLoop().meth7();i<3;new ForLoop().meth8())
		{
			System.out.println("i value:"+i);
			i++;
		}
	}
	void meth10()
	{
		System.out.println("---meth10()----");
		
		int i=1;
		for(;true;)
		{
			System.out.println("i value:"+i);
			i++;
			
		}
		//System.out.println("meth10() exeuted");//unreacheble code bacause it is a true statement;
	}
	void meth11()
	{
		System.out.println("--meth11()---");
        int i=1;
        for(;;)
        {
        	System.out.println("i value:"+i);
        	i++;
        }
	}
	public static void main(String[] args)
	{
		new ForLoop(). meth1();
	    new ForLoop(). meth2();
		new ForLoop(). meth3();
		new ForLoop(). meth4();
		new ForLoop(). meth5();
		new ForLoop().meth6();
		new ForLoop(). meth9();
		//new ForLoop(). meth10();
		//new ForLoop(). meth11();
	}

}
