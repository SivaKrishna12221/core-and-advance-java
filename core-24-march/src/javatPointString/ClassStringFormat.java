package javatPointString;

public class ClassStringFormat {
 public static void main(String[] args) {
	String name="sonoo";
	String sf1=String.format("name is %s",name);
	System.out.println(sf1);
	String sf2=String.format("value is %f ",32.322233);
	System.out.println(sf2);
	String sf3=String.format("value is %32.12f",32.322233);
	System.out.println(sf3);
	String str1=String.format("%d", 101);
	System.out.println(str1);
	String str2=String.format("|%10d|", 101);
	System.out.println(str2);
	
	String str3="ABCDEFG";
	byte[] barr=str3.getBytes();
	for(int i=0;i<barr.length;i++)
	{
		System.out.println(barr[i]);
	}
	System.out.println("********8");
	String s1="this is index of example";
	int index1=s1.indexOf("index");
	System.out.println(index1);
	String s2="this is indexOf method";
	int index=s1.indexOf("method",10);//returns the index of substring
	System.out.println("index of subString"+index);
	String s3="this is indexof method";
	int index2=s3.indexOf('c',12);
	System.out.println(index2);
	String s4="";
	String s5="javatpoint";
	System.out.println(s4.isEmpty());
	System.out.println(s5.isEmpty());
	System.out.println("************8");
	String s6=null;
	String s7="";
	if(s6.isEmpty())
	{
		System.out.println("this String is null");
	}
	else
	{
		System.out.println("this string is not null");
	}
}
}
