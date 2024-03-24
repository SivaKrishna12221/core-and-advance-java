package javatpointInnerClass;

public class ClassX 
{
 static KishanOuterClass kishan= new KishanOuterClass()
		 {
	 public void print()
	 {
		 System.out.println("start");
		 super.print();
		 System.out.println("this is the anonymous inner class");
	 }
	 {
		 System.out.println("anonymous class instance black");
	 }
		 };
   public static void main(String[] args) {
	
	kishan.print();
}
    
}
