package javatpointObClass;

public class ClassStaticBL 
{
int b=100;
 static int a=ClassStaticBL.meth1();
 final static int i;
 static int meth1()
 {
	 System.out.println("meth1 called");
	 return 100;
 }
 static int c=ClassStaticBL.meth1()+400;
 
 void display()
 {
	 System.out.println("display method");
	 System.out.println(a);//ide
	 System.out.println(b);
	 System.out.println(i);
	 System.out.println(new ClassStaticBL().a);//obj
	 System.out.println(ClassStaticBL.a);//clss
	 System.out.println(c);
 }
 static
 {
	 System.out.println("first static block");
	 i=10;
	 System.out.println(new ClassStaticBL().b);//rsp.obje
 }
 static
 {
	 System.out.println("second static block");
 }
 public static void main(String[] args)
 {
	ClassStaticBL cs=new ClassStaticBL();
	cs.display();
}
}
