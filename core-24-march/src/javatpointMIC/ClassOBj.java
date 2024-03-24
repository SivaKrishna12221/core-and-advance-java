package javatpointMIC;

public class ClassOBj 
{
  void meth1()
  {
	  System.out.println("Object Class:Object class is parent class for all the java class");
	  System.out.println("object class is predefined class which is present in java.lang package");
	  System.out.println("object class is the first class"
	  		+ " in java hierarchy");
	  System.out.println("As object class is the parent class every java class objects can access object class methods");
  }
  public String toString()
  {
	  return getClass().getName()+"@"+Integer.toHexString(hashCode());
  }
  public void finalize()
  {
	  System.out.println("garbage has been collected");
  }
  public static void main(String[] args)
  {
	ClassOBj obj=new ClassOBj();
	ClassOBj obj2=new ClassOBj();
	int obj1hashcode=obj.hashCode();
	int obj2hashcode=obj.hashCode();
	System.out.println("hashcode;"+obj1hashcode);
	System.out.println(obj1hashcode);
	System.out.println("-----------");
	boolean val1=obj.equals(obj2);//it checks the address location of an object
	System.out.println("val1"+val1);
	boolean val2=obj.equals(obj);//
	System.out.println("val2:"+val2);//true
	System.out.println("getClas:"+obj.getClass());
	System.out.println("getClass:"+obj2.getClass());
	//toString :it used to convert object into string
	System.out.println("toString:"+obj.toString());
	obj.meth1();
	obj2=null;
	System.gc();
}
}

