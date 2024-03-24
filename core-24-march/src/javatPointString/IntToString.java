package javatPointString;

public class IntToString 
{
  public static void main(String[] args) 
  {
	int i=100;
	String s=String.valueOf(i);
	System.out.println(i+100);//200
	System.out.println(s+100);//100100
	int i1=200;
	String s2=Integer.toString(i1);//integer convert into 22
	System.out.println(s2+100);//200100
	System.out.println(i1+100);//300
	int i3=200;
	String s3=String.format("%d",i3);
	System.out.println(s3);//200
}
}
