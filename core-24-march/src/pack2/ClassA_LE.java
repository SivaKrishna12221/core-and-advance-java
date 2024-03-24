package pack2;

public class ClassA_LE
{
	void show()
	{
		 System.out.println("Implementing Lambda Expressions");
		 InterfaceA x= ()->System.out.println("hello world");
		 x.meth1();
		 System.out.println("---------------");
		 InterfaceB y=(int a ,int b)-> System.out.println("addition:"+(a+b));
		 y.meth2(10,20);
		 System.out.println("===================");
		 InterfaceC z=(int p,int q)->
		 {
			 if(p>q)
			 {
				 System.out.println("if block executed");
				 
			 }
			 else
			 {
				 System.out.println("else block executed");
				 
			 }
		 };
	      z.meth3(30,53);
		 
	}
	public static void main(String[] args)
	{
		new ClassA_LE().show();
		
	}

}
