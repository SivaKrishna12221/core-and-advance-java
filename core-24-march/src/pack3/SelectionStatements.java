package pack3;

public class SelectionStatements
{
	void meth1(int i)
	{
		System.out.println("--------meth1()------");
		if(i<=10)
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}
		
	}
	void meth2(int i)
	{
		System.out.println("--meth2()---");
	
	if (i<=5)
	
		System.out.println("hi");
	    System.out.println("meth2() execution execution");
	    System.out.println(i);
	    
	}
	
	
	/* 
	 In if statement,if we are not writing any flower braces only one statement
	 is dependent on the condition.And in that statement we should not write any
	 declarative statements.
	 */
	int  meth3(int i)
	{
		System.out.println("---meth3()---");
		if (i<=5)
			return 100;
		    return 200;
		//System.out.println("meth3() execution completed");
		 //C.E because it is unreachable code
		    
	}
	void meth4(int i)
	{
		System.out.println("---meth4()---");
		if (i!=10)//i=10 else 
		{
			System.out.println("if block executed");
			
		}
		else
		{
			System.out.println("else block executed");
			
		}
		System.out.println("meth4() execution completed");
	}
	void meth5(int i) 
	{
		System.out.println("---meth5()---");
		if(i==50)
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("hello");
	    }
		System.out.println("meth5() execution completed");
	}
	void meth6(int i)
	{
		System.out.println("-----meth6()----");
		if(false)
			System.out.println("hi ");//dead line
		else
			System.out.println("hello");
		System.out.println("meth6() execution completed");
		
	}
	void meth7(int i)
	{
		System.out.println("--meth7()---");
		if(i>0)
		{
			System.out.println("i+ is a positive number");
			new SelectionStatements().meth8();
		}
		else if( i<0)
		{
			System.out.println("i- is a negative number");
			new SelectionStatements().meth8();
		}
		else
		{
			System.out.println("i+is equal to 0");
			new SelectionStatements().meth8();
		}
	}
	void meth8()
	{
		System.out.println("Java is awesome");
	}
	
	
	
	
	public static void main(String[] args) 
	{
	   SelectionStatements aobj=new SelectionStatements();
	   aobj.meth1(10);
	   aobj.meth2(4);
	   aobj.meth3(6);
	   aobj.meth4(10);
	   aobj.meth5(5);
	   aobj.meth6(5);
	   aobj.meth7(-10);
	  
		
	}

}
