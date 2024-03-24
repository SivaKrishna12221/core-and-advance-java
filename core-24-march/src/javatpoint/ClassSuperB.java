package javatpoint;

public class ClassSuperB  extends ClassSuper
{
  String color="black";
 public void msg()
 {
	 System.out.println();
	 System.out.println(super.color);//we can super class varibale 
	 System.out.println("child");
	
 }
 void work()
 {
	
	
	
	super.msg();
	msg();
	
 }
 
  ClassSuperB()
 {
	
	 System.out.println("classSuperB");
 }
ClassSuperB(int a)
{
	
	
	super();
}
 public static void main(String[] args)
 {
	ClassSuperB s=new ClassSuperB(10);
	s.msg();
	s.work();
}
}
