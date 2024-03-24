package pack2;

public class ClassDa 
{
	void meth1()
	{
		String s="java";
		class innerclassA
		{
			void display()
			{
				System.out.println("implementing ClassDa varibles into innerclass");
				System.out.println(s+" is awesome");
				
			}
			innerclassA()
			{
				System.out.println("innerclass constructor");
			}
			
		}
		new innerclassA().display();
	}
	public static void main(String[] args) 
	{
		new ClassDa().meth1();
	}
}
