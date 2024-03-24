package javatpoint;

public class ClassVaribles 
{
  void meth1()
  {
	int i=10;
	float f=i;//this is  widening: converting data types
	System.out.println(f);
  }
  void meth2()
  {
	  float f=10.5f;
	  int i=(int)f;//this is type casting
	  System.out.println(i);
  }
  void meth3()
  {
	  int a=657;
	  byte b=(byte)a;//overflow
	  System.out.println(b);//-111
  }
  void meth4()//adding lower type
  {
	 byte b=20;
	 byte b2=30;
	 byte b3=(byte)(b+b2);//adding lower type
	 System.out.println(b3);//50
  }
  void meth5()
  {
	 int a=10;
	 byte b=(byte)a;
	 float f=a;
	 float f2=f;
	 System.out.println(f2);
  }
  public static void main(String[] args) 
  {
	ClassVaribles cvobj=new ClassVaribles();
	cvobj.meth1();
	cvobj.meth2();
	cvobj.meth3();
	cvobj.meth4();
	cvobj.meth5();
}
}
