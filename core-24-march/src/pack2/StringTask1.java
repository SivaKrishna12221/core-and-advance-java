package pack2;
/*
 * Given a string name,e.g"Bob",return a greeting of the form "hello Bob".
 * helloName("Bob")?"hello Bob !".
 */

public class StringTask1 
{
	public String helloName(String Name)
	{
		return "hello".concat("java").concat("!");
		
	}
	public static void main(String[] args)
	{
		StringTask1 aobj=new StringTask1();
		String result=aobj.helloName("java");
		System.out.println(result);
			
	}

}
