package pack3;

public class ClassInterThreadD 
{
	public static void main(String[] args) 
	{ 
	 ClassInterThreadC cobj=new ClassInterThreadC();
	 new Thread()
	 {//anonymous inner class starts here
		 public void run()
		 {
			try
			{
				cobj.with_draw(20000);//calling with_draw method(1500)
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		 }
	 }//anonymous inner class ends here
      .start();
	 new Thread()
	 {//anonymous inner Class start here
		 public  void run()
		 {
			 
			 {
				 cobj.deposit(5000);
			 }
			 
			 
		 }//anonymous inner class end here
	 }
	 .start();
		
	}

}
