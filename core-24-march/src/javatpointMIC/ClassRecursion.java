package javatpointMIC;
//Recursion in java is a process of calls a method  itself continuosly.
//A method called the same method itself is known as a recursion
public class ClassRecursion
{
  static  int count=0;
  
  static void meth1()
  {
	count++;
	if(count<5)
	  System.out.println("hello"+count);
	  meth1();
  }
  public static void main(String[] args) {
	meth1();
}
}
