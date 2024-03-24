package pack4;

public class Class1 
{
  void meth1()//calling from this.meth()
  {
	  System.out.println("Class one method");
  }
  Class1()//calling from super()
  {  
	  this(100);//calling a parameterized constructor
	  System.out.println("Default constructor of Class1");
  }
  Class1(int a)
  {
	  System.out.println("Class1 parameterized constrcutor:"+a);
	  this.meth1();//calling method inside class 
  }
  
}
