package abc;

public class ClassStaticB extends ClassStaticA
{
  static void meth1()
 {
	 System.out.println("ClassStaticB.meth1()");
	 
 }
  protected void meth2()//child class method should not be more restrictive than the parent class methods
  {
	  System.out.println("meth2 callled ClassStaticB");
  }
 public static void main(String[] args) {
    ClassStaticA csb=new ClassStaticB();
	csb.meth1();
	 //ClassStaticA.meth1();
	ClassStaticB csb2=new ClassStaticB();
	csb2.meth2();
	ClassStaticA csb3=new ClassStaticB();
	csb3.meth2();//we can't overide a  private methods the scope of private methods with in the class only
			
}
}
