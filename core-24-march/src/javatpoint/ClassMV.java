package javatpoint;

public class ClassMV 
{
 public int  meth1(int a,int b)
 {
	 System.out.println("meth1 ");
	 return a+b;
 }
 public int  meth2(int a,int b)
 {
	 System.out.println("meth2()");
	 return a+b;
 }
 public static void main(String[] args)
 {
	ClassMV aobj=new ClassMV();
	
	System.out.println(aobj.meth1(10,20));
	
	
}
}
