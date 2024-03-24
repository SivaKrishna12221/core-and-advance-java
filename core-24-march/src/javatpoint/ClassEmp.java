package javatpoint;

public class ClassEmp 
{
  String ename;
  int empno;
  ClassAddress address;//another class entity .HAS-A relation.
  public  ClassEmp(String ename,int empno,ClassAddress addresss)
  {
	  this.ename=ename;
	  this.empno=empno;
	  this.address=address;
	  
	  
  }
  public void display()
  {
	  System.out.println(ename+" "+empno);
	  System.out.println(address.country+" "+address.state+" address.zipcode");
	  
  }
  public static void main(String[] args)
  {
	ClassAddress ca=new ClassAddress("india","ap",516289);
	ClassAddress ca2=new ClassAddress("America","england",502344);
	ClassEmp em1=new ClassEmp("siva",101,ca);
	ClassEmp em2=new ClassEmp("ramana",202,ca2);
	em1.display();
	em2.display();
	
	
}
  
}
