package pack1;

public class ClassBJoin extends Thread
{
  public static void main(String[] args)
  {
	ClassJoin cobj=new ClassJoin();
	cobj.start();

	for(int i=1;i<=5;i++)
	{
		System.out.println("ClassB method "+i);
	}
  }
}
