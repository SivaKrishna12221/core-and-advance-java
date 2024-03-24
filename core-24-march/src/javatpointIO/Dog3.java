package javatpointIO;

public class Dog3  extends Animal
{
  static void meth1(Animal a)
  {
	  
		  Dog3 d=(Dog3)a;
		  System.out.println("ok downcasting performed");
	  
  }
  public static void main(String[] args)
  {
	Dog3 a =new Dog3();
	Dog3.meth1(a);
}
}
