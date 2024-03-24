package pack4;

public class ClassAD extends Thread
{
   public void run()
   {
	   for (int i=2;i<=10;i++)
	   {
		   System.out.println("ClassA run method:"+i);
		   i++;
		   
	   }
   }
   public static void main(String[] args)
   {
	   ClassAD adobj=new ClassAD();
	   
	   Thread t1=new Thread(adobj);
	   t1.start();
       
       for(int i=1;i<=10;i++)
       {
    	   System.out.println("classB method:"+i);
       }
	   
   }
}
