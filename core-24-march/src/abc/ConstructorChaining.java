package abc;

public class ConstructorChaining 
{
  int id;
  int age;
   String name,college;
   
  public ConstructorChaining(int id)
  {
	  this.id=id;
  }
  public ConstructorChaining(int id,int age)
  {
	  this(id);
	  this.age=age;
	  
  }
  public ConstructorChaining(int id,int age,String name,String college)
  {
	this(id,age) ;
     this.name=name;
	  this.college=college;
  }
  public static void main(String[] args) {
	ConstructorChaining cs=new ConstructorChaining(101,23,"siva","yvu");
	System.out.println(cs.id+" "+cs.age+" "+cs.name+" "+cs.college);
}
}
