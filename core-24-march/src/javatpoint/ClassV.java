package javatpoint;

public class ClassV 
{
  int a;
  //for every instance of a class separate copy of instance varible
  //will be created.that means how many objects are created those many instance varibles available in the program
  
  static int b;
  final static String s;
  
  void meth1()
  {
	  int a=10;
	  //if instance variable and local variable are present in the 
	  // class with same name the first  priority goes to the local varibel
	  System.out.println(a);
	  System.out.println(b);
	  	  System.out.println(a);
	  	  System.out.println(ClassV.b);
  }
  static void meth2()
  {
	  System.out.println(new ClassV().a++);
	 
	  System.out.println(b++);
  }
  static
  {
	  s="siva";
	  System.out.println(s);
  }
  public static void main(String[] args) 
  {
	ClassV v=new ClassV();
	
	meth2();
	new ClassV().meth2();
	ClassV.meth2();
	v.meth1();
	
	
}
}
