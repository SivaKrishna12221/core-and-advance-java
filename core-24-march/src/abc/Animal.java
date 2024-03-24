package abc;

public class Animal 
{
 public void eat()
 {
	 System.out.println("Animals can eat grass");
 }
}
class Buffallo extends Animal
{
  public void drink()
  {
	  System.out.println("buffallo can eat grass");
  }
}
class Ox extends Buffallo
{
	public void eating()
	{
		System.out.println("ox can eat grass");
	}
}

