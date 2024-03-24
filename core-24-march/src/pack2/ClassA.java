package pack2;

public class ClassA 
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	public static void main(String[] args)
	{
		ClassA aobj1=new ClassA();//creating a object
		ClassA aobj2=new ClassA();//creating another object
		  
		int aobj1hashCode=aobj1.hashCode();//creating hashCode()
		int aobj2hashCode=aobj2.hashCode();//creating hashCode()
		
		System.out.println("aobj1 hashcode is:"+aobj1hashCode);
		System.out.println("aobj2 hashcode is:"+aobj2hashCode);
		System.out.println("___________________");
		
		boolean val1=aobj1.equals(aobj2);//false
	    boolean val2=aobj1.equals(aobj1);//true
		boolean val3=aobj2.equals(aobj1);//false
	    boolean val4=aobj2.equals(aobj2);//true
	    System.out.println("val1:"+val1);
	    System.out.println("val2:"+val2);
	    System.out.println("val4:"+val4);
	    
	    System.out.println(aobj1.equals(new ClassA()));//false
	    System.out.println(new ClassA().equals(new ClassA()));//false
	    System.out.println("_______");
	    System.out.println("getClass():"+aobj1.getClass());//
	    System.out.println("getClass():"+aobj2.getClass());
	    System.out.println("________________");
	    System.out.println("toString():"+aobj1.toString());
	    System.out.println("toString():"+aobj2.toString());
	}
}
	
		
		
		
	


