package javatpoint;

public   class ClassFinal
{
/*
 * final :final keyword is used in java to restrict the user.
 * The final keyword can be applied to instance variable which we
 * didn't assign the value then it is called blank final varible.
 * The blank final varible can be static that can be initilized only 
 * through static block;
 * 
 */
  final int i;
  final static int a;
   final void meth1()
  
  {
	  System.out.println("parent final method");
	  
	  
  }
  ClassFinal()
  {
	  i=10;
  }
  static
  {
	  a=10;
  }
 public static void main(String[] args)
 {
  ClassFinal cf	= new ClassFinal();
	cf.meth1();
}
}
