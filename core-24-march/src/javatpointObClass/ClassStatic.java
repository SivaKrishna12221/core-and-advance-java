package javatpointObClass;

public class ClassStatic 
{
  int id;
  String name;
  static String college="srihari";
  final static int a=10;
  ClassStatic(int i,String n)
  {
	  id=i;
	  name=n;
  }
  void display()
  {
	  System.out.println(id+" "+name+" "+college+" "+a);
  }
}
