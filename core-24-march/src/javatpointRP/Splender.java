package javatpointRP;

public class Splender extends Bike
//upcasting //the referrence variable of parent class refferes the child calss object is called upcasting
 
{
 int price=240000;
  void run() 
  {
	  System.out.println("Bike class executed");
  }
  public static void main(String[] args) 
  {
	Bike b=new Splender();
	b.run();//upcasting 
	//since method invocation is done by Jva not compiler so it is 
	//run time polymorphism
	System.out.println(+b.price);
}
}
