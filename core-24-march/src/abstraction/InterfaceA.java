package abstraction;

public interface InterfaceA //interface is a blue print of a class
/*
 * Every interface methods by default public and abstract
 * Every interface variables by default static and final
 * in interface java 1.8v onwards we can use default methods ,
 * java 1.8 v onwards we can write static methods and including main()
 * java 1.9 v onwards we can private methods also.
 *just like an abstract class for an interface also we cannot create an
 *object for interface
 *Inside an interface we can't write constructor
 *if we want to inherit a interface into a class we should use implement keyword in the class
 * interface=>implement=>class
 * Whenever we are inheriting an interface into class 100% we need to provide implementation for
 *  abstract methods which are present in the interface
 *  If we don't want to provide implementation for the abstract class
 *  we need to change our child class also abstract 
 *
 */
{
 int a=10;
 int b=20;
   default void meth1()
  {// public and abstract method
  System.out.println("InterfaceA");
  }
  default void meth2()//default methods
  {
	  System.out.println("InterfaceA default method");
  }
  static void meth3()
  {
	  System.out.println("interfaceA static methods");
  }
  private void meth4()
  {
	  System.out.println("interfaceA private methods");
  }
  default void InterfaceA()
  {
	  System.out.println("Trying an to create constructors");
  }
  public static void main(String[] args) 
  {
	System.out.println("InterfaceA main method");
	//InterfaceA aobj=new InterfaceA();//we can't create an object methods for interface methods 
	//aobj.meth1();
}
  /*
   * A functional interface is an interface which is having only one abstract method
   * 2)Inside a functional interface we can have any number of private methods ,default methods,static
   * methods ,including main method also .But should be only one abstract method
   * ex:Runnable Interface,consumer Interface,Predicate Interface etc.
   
   * Marker Interface :
   * A marker interface will not be having any varibles are methods,It is just an 
   * empty interface 
   * If a class is inheriting this marker interface it will achieve some special properties.
   * seriliazable interface ,cloneable Interface.
   */
}
