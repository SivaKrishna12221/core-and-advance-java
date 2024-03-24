package stringHandling;

public class ClassA 
{
 public  int meth1(int a)
 {
	 System.out.println("java");
	 return a;
	 
 }
	
 public static void main(String[] args) 
 {
  ClassA aobj=new ClassA();
  int result=aobj.meth1(10);
  System.out.println(result);
}
}
