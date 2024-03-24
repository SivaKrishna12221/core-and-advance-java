package pack4;

public  class ClassF  implements InterfaceA,InterfaceB
{
	 public void meth1()
	{
		System.out.println("InterfaceA Abstract method overidden");
	}
	 ClassF()
	 {
		 System.out.println("executing constructor");
	 }
	public static void main(String[] args) 
	{
		 InterfaceA aobj=new ClassF();
		 aobj.meth1();
		 aobj.meth2();
		 System.out.println("==========");
		 InterfaceB bobj= new ClassF();
		 bobj.show();
		 
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
