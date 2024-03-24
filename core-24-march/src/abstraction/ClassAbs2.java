package abstraction;

public class ClassAbs2 extends ClassAbs
/*//implementation object creation and object calling
 * if we are inherting an abstract class if the abstract class contains
 * abstract methods then 100% we need to provide the implementation 
 * for all the abstracts methods in the child other wise we will getting
 * a compile time error.
 * If we dont want provide implementation for the abstract methods 
 * present inside abstract then make your child class as  private.
 */
{
  void meth1()
  {
	  System.out.println("method overidden ");
  }
  void meth2() {
	  System.out.println("meth2 called , overidden");
  }
  public static void main(String[] args)
  {
	ClassAbs abs2=new ClassAbs2();//upcasting
	abs2.meth1();//method overiding concept is occured
	abs2.meth2();
	abs2.meth3();
	//abs2.main();//we can't inherit a main mehod because it contains static methods
}
}
