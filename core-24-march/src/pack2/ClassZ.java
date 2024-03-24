package pack2;

public class ClassZ 
{
	static int a=ClassZ.meth1();//calling a method 
	static int meth1()//static method  //a=100
	{
		System.out.println("meth1() called");
		return 100;
	
	}
	static //static blocks a=500
	{
		System.out.println("1st block:"+a);
	}
	static int b=ClassZ.meth1()+400;//b=100+400
    
	public static void main(String[] args)
	{
		System.out.println("java is awesome");
	}
	static //static blocks 
	{
		System.out.println("2nd static block:"+b);
		
	}

}
