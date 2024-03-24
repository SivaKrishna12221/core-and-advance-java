package pack2;

public final class ClassfinalA //final classes can't be inherited 
{
 final int a=10;//final variables are constants
 final int b=20;
  final void meth1()//final methods can't be overridden
 {
	 System.out.println("final meth1() called");
	 //System.out.println(a++);//final variables are constants so we can't change
 }
  public static void main(String[] args)
  {
	  new ClassfinalA().meth1();
	
}
}
