package pack4;

public class ClassA
{
   private void meth1()
  {
	  System.out.println(10);
  }
  public void meth1(int a)
  {
	  System.out.println(20);
  }
   protected  final static void meth1(int a,String s)
  {
	  System.out.println(30);
  }
  static String meth1(String s, int a)
  {
	  System.out.println(40);
	  return s ;
  }
  void meth1(String s)
  {
	  System.out.println(50);
  }
  
  ClassA meth1(StringBuffer s)
  {
	  System.out.println(60);
	  return this;
  }
  private byte  meth1(byte b)
  {
	  System.out.println(70);
	  return b;
  }
  public static void main(String[] args) 
  {
  ClassA aobj=new ClassA();
  aobj.meth1();
  aobj.meth1(12);
  aobj.meth1(12,"Java");
  aobj.meth1("Java",12);
  aobj.meth1("Java");
  aobj.meth1(new StringBuffer("java"));
  aobj.meth1((byte)100);
}
   public static void main(String s)
  {
	  System.out.println("1st main()");
  }
  void main()
  {
	   System.out.println("2nd main()");
  }
  ClassA()
  {
	  this("Java");
	  System.out.println("Java");
	  System.out.println("hi");
	  System.out.println("------");
	  
  }
  ClassA(String s)
  {
	  System.out.println("hello");
	  
  }
 
}

