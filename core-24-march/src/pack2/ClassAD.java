package pack2;

public class ClassAD 
{
	static int x=10;
	public static void main(String[] args)
	{
		ClassAD t1=new ClassAD();//creating an object 
		ClassAD t2=new ClassAD();
		t1.x=20;
		System.out.print(x+" ");//20 
		System.out.println(t2.x);//10
		
	}

}
