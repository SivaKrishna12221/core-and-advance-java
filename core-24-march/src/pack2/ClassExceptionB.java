package pack2;

public class ClassExceptionB 
{
 void meth1()
 {
     String s="siva krishna";
	 try
	 {
		 System.out.println(32/0);
		 System.out.println("length():"+s.length());
		 
	 }
	 catch(NullPointerException n)
	 {
		 System.out.println(" first catch block executed");
		
	 }
	catch(ArithmeticException e)
	 {
		 System.out.println("toString:"+e.toString());//it gives the name& reason
	 }
	 //we can use multiple exceptions by using multiple catch blocks..
	
	 
	// System.out.println(32343);
	 //Between try-catch-final block there should not be any individual statements
	 finally
	 {
		 System.out.println("final block executed");
	 }
	 //finally block is used to close the existing database or server connections
	 //we can handle multiple exceptions by using multiple catch blocks
	
 }
 public static void main(String[] args)
 {
	 new ClassExceptionB().meth1();
	
}
}
