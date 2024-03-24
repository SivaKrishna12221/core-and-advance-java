package pack2;

public class ClassAK 
{
     void meth1()
	{
		int i=10;
		Integer ival1=i;
		Integer ival2=new Integer(i);
		//Integer ival3='Integer.value of (i)';
		System.out.println("int PDT value:"+i);
		System.out.println("Integer WCO value :"+ival1);
		System.out.println("Integer WCO value:"+ival2);
		//System.out.println("Integer WCO value:"+ival3);
		System.out.println("--------------------");
	}
     {
     byte b=50;
     Byte bval1=b;
     Byte bval2=new Byte(b);
    //Byte bval3=Byte.value of ("b");
     
     System.out.println("int PDT value:"+b);
     System.out.println("Integer WCO value:"+bval1);
     System.out.println("Integer WCO value;"+bval2);
    //System.out.println("Byte WCO value:"+bval3);
}
    public static void main(String[] args)
    {
    	ClassAK aobj=new ClassAK();
    	aobj.meth1();
		
	}
    //wronggggggggg
    

}
