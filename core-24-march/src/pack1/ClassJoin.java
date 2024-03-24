package pack1;

public class ClassJoin extends Thread
{
   public void run()
   {
	   for(int i=1;i<=5;i++)
	   {
		   System.out.println("ClassA method:"+i);
	   }
   }
}
