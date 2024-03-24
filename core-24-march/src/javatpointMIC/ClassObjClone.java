package javatpointMIC;

public class ClassObjClone implements Cloneable
{
  String name;
  int sal;
  ClassObjClone(String name,int sal)
  {
	  this.name=name;
	  this.sal=sal;
  }
  public Object clone()throws CloneNotSupportedException
  {
	  return super.clone();
  }
  public static void main(String[] args) 
  {
	try {
		ClassObjClone co=new ClassObjClone("siva",40000);
		ClassObjClone co2=(ClassObjClone)co.clone();
		
		System.out.println(co.name+" "+co.sal);
		System.out.println(co2.name+" "+co2.sal);
		co.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
