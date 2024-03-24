package oct2023;



public class InterfaceImplClass implements InterfaceEx {

	@Override
	public void meth1() {
		System.out.println("implementing meth1 ");
	}
	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		
	}
	public void meth4()
	{
		System.out.println("normal methods");
	}
	
	public static void main(String[] args) {
		InterfaceEx interfaeca=new InterfaceImplClass();
		interfaeca.meth1();
		interfaeca.meth2();
		String[] array={"ramana","raja"};
		System.out.println(interfaeca.b);
		System.out.println(interfaeca.toString());
		
       InterfaceEx.meth5();
	}
}
