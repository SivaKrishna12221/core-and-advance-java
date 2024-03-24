package oct2023;

public  class AbstractImplClass extends AbstractClass
{
    
	@Override
		public int meth1() {
			// TODO Auto-generated method stub
		System.out.println("sivas");	
		return 10;
		}
	
   public static void main(String[] args) {
  AbstractImplClass obj= new  AbstractImplClass();
   System.out.println(obj.meth1());
   obj.meth2();
  
}
}
