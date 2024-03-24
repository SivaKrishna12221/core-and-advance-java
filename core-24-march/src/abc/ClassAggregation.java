package abc;

public class ClassAggregation
{
   int id;
   String name;
   long mobile;
   Address address;
   
   public ClassAggregation(int id,String name,long mobile,Address address)
   {
	  
	   this.id=id;
	   this.name=name;
	   this.mobile=mobile;
	   this.address=address;
   }
   public void display()
   {
	   System.out.println("id:"+id+" name"+name+" mobile:"+mobile+" Address:"+address);
   }
   public static void main(String[] args) {
	Address ad=new Address("jangampalli","kadapa","ap");
	ClassAggregation cg=new ClassAggregation(101,"siva",7799352324l,ad);
    cg.display();
}
   
}
