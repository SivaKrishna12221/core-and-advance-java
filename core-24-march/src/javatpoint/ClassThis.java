package javatpoint;

public class ClassThis
{
  void meth1()
  {
	  System.out.println("parent method");
  }
  ClassThis()
  {
	  System.out.println("parent class default constructor");
  }
  ClassThis(int a,int b)
  {
	  System.out.println(a+" "+b);
  }
}

