package pack4;

public class CloneClassC 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("implementing clone()");
		CloneClassA aobj1=new CloneClassA();
		System.out.println(aobj1.a+" "+aobj1.b);
	    CloneClassA aobj2=aobj1;//not cloning
	    aobj2.b=50;
	    System.out.println(aobj1.a+" "+aobj1.b+" "+aobj2.b);
	    CloneClassB bobj1=new CloneClassB();
	    System.out.println(bobj1.x+" "+bobj1.y);
	    CloneClassB bobj2 =bobj1.show();//here we are creating an object for a clone 
	    bobj2.y=999;
	    System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.y);
	
	    
		
		
	}

}
