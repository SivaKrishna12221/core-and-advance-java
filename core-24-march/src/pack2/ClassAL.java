package pack2;

public class ClassAL 
{ 
	void meth1()
	{
	Integer ival1=new Integer(100);//100
	Integer ival2=new Integer("500");//500
	
	System.out.println("Integer WCO ival1:"+ival1);//100
	System.out.println("Integer wco ival2:"+ival2);//500
	System.out.println("---------------------");
	
	Byte bval1=new Byte((byte)15);//15
	Byte bval2=new Byte("25");//25
	
	System.out.println("Byte wco bval1:"+bval1);//15
	System.out.println("Byte wco bval2:"+bval2);//25
	System.out.println("--------------------");
	
	
	Boolean booleanval1=new Boolean(true);
	Boolean booleanval2=new Boolean("fals");
	System.out.println("Boolean WCO booleanval1:"+booleanval1);//true
    System.out.println("Boolean WCO booleanval2:"+booleanval2);//true
    System.out.println("-------------");
    
    Character cval1=new Character('A');
    System.out.println("character WCO cVal:"+cval1);
    
    System.out.println("-------------------");
    
    System.out.println("performing auto unboxing");
    
    int x=ival1.intValue();
    byte y=bval1.byteValue();
    boolean  flag=booleanval1.booleanValue();
    char c=cval1.charValue();
    
    System.out.println("int PDT:"+x);
    System.out.println("byte PDT:"+y);
    System.out.println("boolean PDT:"+flag);
    System.out.println("char PDT:"+c);
	}
	public static void main(String[] args) 
	{
		ClassAL aobj=new ClassAL();
		aobj.meth1();
		
	}
	
	
	
	
	
	
}
