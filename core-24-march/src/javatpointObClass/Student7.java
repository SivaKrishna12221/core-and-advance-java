package javatpointObClass;

import javatPointString.SliptClass2;

public class Student7 
{
  int id;
  String name;
  public Student7(int i,String n)
  {
	  id=i;
	  name=n;
  }
  public Student7()
  {
	  
  }
  public void display()
  {
	  System.out.println(id+" "+name);
  }
  public static void main(String[] args)
  {
	Student7 s1=new Student7(10,"siva");
	s1.display();
	Student7 s2=new Student7();
	s2.id=s1.id;
	s2.name=s1.name;
	s2.display();
}
}
