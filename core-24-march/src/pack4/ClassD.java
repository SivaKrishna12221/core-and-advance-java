package pack4;

	public abstract class ClassD
	{
		public abstract void meth1();
		
		abstract void meth1(String s);
		
		
		void meth2()
		{
			System.out.println("calling a meth2()");
		}
		ClassD()
		{
			System.out.println("ClassD constructor called");//calling from main()
		}
		static void meth3()
		{
			System.out.println("ClassD static method called");
		}
		public static void main(String[] args)
		{
			System.out.println("ClassD main");
			
			//ClassD dobj1=new ClassD();//c.e because an abstract class can't instantiated,
			
			meth3();
			
			
		}
	}
	


