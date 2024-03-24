package abstraction;

public  class ClassA extends ClassB implements InterfaceA,InterfaceB
{
   public void meth1()
   {
	   System.out.println("interfaceA obstract method overidden");
   }
  
   public static void main(String[] args) 
   {
     InterfaceA aobj=new ClassA();//we can hold a child class object with parent class reference with that reference we can called parent class methods 
     aobj.meth1();//here we can call only child class methods
     aobj.meth2();
     System.out.println("======");
     InterfaceB bobj=new ClassA();
     bobj.show();
     System.out.println("==");
}

@Override
public void show() {
	// TODO Auto-generated method stub
	
}
}
