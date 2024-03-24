package javatpointObClass;

public class ClassStaticV 
{
int id=1;
  static String name="SIVA";
  static int code=100;
  final static int rollno=10;
 
  public int display()
  {
	  
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(code);
	  System.out.println(new ClassStaticV().code);
	  System.out.println(ClassStaticV.code);
	  return 10;
  }
  static  void display1()
  {
	 
	 // System.out.println(id);
	  System.out.println(new ClassStaticV().id);//we can access non static variable inside a static method with the help of respective class object
	  System.out.println(name);
	  System.out.println(code);
	  System.out.println();
	  System.out.println(new ClassStaticV().display());
  }
  
  public static void main(String[] args) 
  {
	ClassStaticV sv=new ClassStaticV();
	sv.display();//accessing with the help of objectname
	display1();
	ClassStaticV.display1();
}
}
