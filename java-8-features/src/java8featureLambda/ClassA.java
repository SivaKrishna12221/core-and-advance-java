package java8featureLambda;

public class ClassA 
{  
    void show() {
	InterfaceA inte=(int a,int b)->System.out.println("addition "+(a+b));
	inte.meth1(10,30);
	
    InterfaceB inteb=(int age)->
    {
    if(age<=18)
    	return "not eligible to vote";
    else
    	return "eligible";
    };
    System.out.println("==>"+inteb.elgibility(10));
     
    InterfaceC intec=(int a,int b,int c)->
    {
     if(a>=b&&a>=c)	
     {
    	 return a;
     }
     else if(b>=a&&b>=c)
     {
    	 return b;
     }
     else 
     {
    	 return c;
     }
    };
     System.out.println("biggest=>"+intec.biggest(2,3,3));
    }
    
    

    
	public static void main(String[] args) {
    new ClassA().show();
    
    
    InterfaceD inted=(String s1,String s2)->
    {
       String str1=s1.toUpperCase()+s2.toLowerCase();
       return str1;
    };
   System.out.println("==>"+inted.concatTwo("siva","krishna"));
  
	}
}