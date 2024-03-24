package pack4;

public class ClassC extends ClassB
{
  void meth1()
  {
   System.out.println("Called ClassC method");
   }
  void meth1(int a,int b)
  {
    System.out.println("substraction="+(a-b));
  }
   String show()
  {
   System.out.println("hello");
    return "Java is awesome";
  }
   public static void main(String[] args) 
   {
	      
	   ClassB bobj1=new ClassB();
	   bobj1.meth1();
	   bobj1.meth1(99,1);
	   System.out.println("===>"+bobj1.show());
	   System.out.println("==================");
	   
	   ClassC cobj2 = new ClassC();
	   cobj2.meth1();
	   cobj2.meth1(99,1);
	   System.out.println("===>"+cobj2.show());
	   
	     
}
}
