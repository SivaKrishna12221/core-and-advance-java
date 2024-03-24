package javatpointRP;

public class ChildDog extends Dog
{
  void eat()
  {
	  System.out.println("drinking milk");
  }
  public static void main(String[] args) {
   Animal a;
 a= new ChildDog();
 a.eat();
 a=new Dog();
 a.eat();
 a=new Animal();
 a.eat();
 
}
}
 
