package pack2;

public class ClassAL_E
{
  void show()
  {
	  System.out.println("Implementing Lambda Expressions");
	 // InterfaceA aobj=new ClassBL_E()::meth1;//non-static method referring
	  
	  InterfaceA aobj= ClassBL_E::meth2;
	  InterfaceA aobj=ClassBL_E::new ClassBL_E;
	  aobj.person(22);
  }
  public static void main(String[] args)
  {
	  new ClassAL_E().show();
	  
	  
	
}
}
