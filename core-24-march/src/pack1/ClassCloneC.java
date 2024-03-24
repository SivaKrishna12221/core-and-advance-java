package pack1;


public class ClassCloneC
{
   public static void main(String[] args) throws CloneNotSupportedException 
   {
	System.out.println("implementing clone()");
	ClassCloneA aobj1=new ClassCloneA();
	System.out.println(aobj1.a+" "+aobj1.b);
	ClassCloneA aobj2=aobj1;//not cloning
	aobj2.b=50;
	System.out.println(aobj1.a+" "+aobj1.b+" "+aobj2.b);//10 50 50
	ClassCloneB bobj1=new ClassCloneB();
	System.out.println(bobj1.x+" "+bobj1.y);
	ClassCloneB bobj2=bobj1.show();
	bobj2.y=999;
	System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.y);
	
}
}
