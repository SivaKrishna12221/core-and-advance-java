package pack2;

public class ClassAG
{
	static int a=0;
	int b=0;
	
	ClassAG()
	{
		a++;//a=0 ,a=1
		b++;//b=0 ,b=1
		System.out.println("static varaible===>"+a);
		System.out.println("Instance varaible==>"+b);
		System.out.println("---------");
	}
	void display()
	{
		System.out.println("****Accesing static variable ****");
		System.out.println(ClassAG.a);
		System.out.println(a);
		System.out.println(new ClassAG().a);
	}
	public static void main(String[] args) 
	{
		new ClassAG();//calling a constructor
		new ClassAG();
		new ClassAG();
		System.out.println("######");
		new ClassAG().display();
		
	}
	

}
