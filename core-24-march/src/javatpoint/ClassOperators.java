package javatpoint;

public class ClassOperators 
{
  void meth1()
  {
	  int a=10;
	  int b=20;
	  System.out.println(a++ + ++a);//10(10+1)+(12)10=>22
	  System.out.println(a+b);//32
	
  }
  void meth2()
  {
	  System.out.println(10*10/5+3-1*4/2);//bodmus 21
  }
  void meth3()
  {
	  System.out.println(10<<2);//10*2^2=40//multplication and power of two 
	  System.out.println(10<<3);//10*2^3=80;
	  System.out.println();
	  System.out.println(10>>2);//10/2^2=10/4=2.
	  System.out.println(20>>3);//20/2^3=20/8=2
  }
  void meth4()
  {
	  int a=5;
	  int b=3;
	  int min=(a<b)?a:b;//it is used to check the two values which one is big
	  System.out.println(min);
  }
  public static void main(String[] args) {
	ClassOperators cobj=new ClassOperators();
	cobj.meth1();
	cobj.meth2();
	cobj.meth3();
	cobj.meth4();
}
}
