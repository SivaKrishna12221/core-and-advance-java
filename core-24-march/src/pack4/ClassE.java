package pack4;

	public class ClassE extends ClassD
	{
		public void meth1()
		{
			System.out.println("method 1() overidden");//calling from main
		}
		void meth1(String data)
		{
			System.out.println(data);//
			
		}
		public static void main(String[] args) 
		{
			ClassD dobj1=new ClassE();
			dobj1.meth1();
			dobj1.meth2();
			dobj1.meth1("Java is awesome");
		}
	}
	

