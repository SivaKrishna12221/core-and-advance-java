package javatpointIO;

public class Dog extends Animal
{
  void meth1()
  {
	  
  }
  
  public static void main(String[] args) 
  {
	//Dog d=new Dog();//true;
	Dog d=null;//false
	System.out.println(d instanceof Animal);
}
}
