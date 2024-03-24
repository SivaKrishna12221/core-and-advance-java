package javatpointInter;

public class ClassInterface implements InterfaceA
{
  /*
   * If we are inheriting an interface into Calss 100% we need to provide implementation
   * for all the methods which are present in the interface .if don't want  provide implementation compile time error
   */
  public void meth1()
  
  {
	  System.out.println("ClassInterface interface");
  }
  public static void main(String[] args) {
	InterfaceA i=new ClassInterface();
	i.meth1();//in real scenario provide the object through the method
	i.meth4();
}
}
