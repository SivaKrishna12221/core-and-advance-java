package threads;

public class ClassD 
{
 public static void main(String[] args) throws InterruptedException
 {
	ClassC cobj=new ClassC();
	cobj.start();//default thread executed 
	cobj.join();//join method allows the current execution thread is wait for execution  another thread
	{
		for (int i=1;i<=3;i++)
		{
			System.out.println("classD method executed:"+i);
		}
	}
	
}
}
