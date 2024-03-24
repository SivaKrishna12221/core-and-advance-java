package javatpointMIC;

public class ClassWrapper1 
{//Auto boxing converting primitive data type into corresponding wrapper classes
 public static void main(String[] args) {
	int i=10;
	Integer a=Integer.valueOf(i);//converting int to Integer class explicitly
	Integer b=a;//converting int to integer implicitly
	System.out.println(i+" "+a+" "+b);
	
	
	
}
}
