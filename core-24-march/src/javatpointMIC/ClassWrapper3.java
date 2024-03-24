package javatpointMIC;

public class ClassWrapper3 
{
  public static void main(String[] args) {
	byte b=10;
	short s=20;
	int i=30;
	long l=40;
	float f=50.0f;
	double d=60.0D;
	boolean flag=true;
	char c='a';
	Byte bobj=Byte.valueOf(b);
	Byte bobj2=b;
	Short sobj=Short.valueOf(s);
	Short sobj2=s;
	Integer iobj=Integer.valueOf(i);
	Integer iobj2=i;
	Long lobj=Long.valueOf(l);
	Long lobj2=l;
	Float fobj=Float.valueOf(f);
	Float fobj2=f;
	Double dobj=Double.valueOf(d);
	Double dobj2=d;
	Boolean boobj=Boolean.valueOf(flag);
	Boolean boobj2=flag;
	Character cobj=Character.valueOf(c);
	Character cobj2=c;
	System.out.println("byteOBj:"+bobj);
	System.out.println("byteobj:"+bobj2);
	System.out.println("shortObj:"+sobj2);
	System.out.println("charObj:"+cobj);
	System.out.println("charobj:"+cobj2);
	System.out.println("double :"+dobj);
	System.out.println("boolean obj:"+boobj);
	System.out.println("character obj:"+cobj);
	byte bytevalue=bobj;
	System.out.println(bytevalue);
	short shortvalue=sobj;
	System.out.println(shortvalue);
	boolean booleanvalue=boobj;
	System.out.println(booleanvalue);
	char charactervalue=cobj;
	System.out.println(charactervalue);
	double doublevalue=dobj;
	System.out.println(doublevalue);
	float floatvalue=fobj;
	System.out.println(floatvalue);
}
}
