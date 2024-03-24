package pack2;

public class AnonymousClass 
{
 static OuterClass out= new OuterClass()
		 {
	void print()
	{
		System.out.println("start");
		super.print();
		System.out.println("I am in anonymous inner class");
		System.out.println("end");
	}
		 };
		 {
			 System.out.println("Anonymous inner Class");
		 }
		 public static void main(String[] args) 
		 {
			out.print();
		}
}

