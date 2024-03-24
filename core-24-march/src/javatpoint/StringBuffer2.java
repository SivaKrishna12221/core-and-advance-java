package javatpoint;

import java.util.Arrays;

public class StringBuffer2 {

	public static void main(String[] args) {
		/*String str="siva krishna";
		 System.out.println(str.hashCode());
		 str.concat("velpula");
		 System.out.println(str.hashCode());
		 str.equals("ravi");
		 System.out.println(str);
		 StringBuffer sb=new StringBuffer("ravi");
		 System.out.println(sb);
		 System.out.println(sb.hashCode());
		 sb.append("kumar");
		 sb.equals("ravi");
		 System.out.println(sb);
		 System.out.println(sb.hashCode());
		 String str3=String.join("?","Raju","is","a",null,"good","boy");
		  System.out.println(str3);*/
		/* String str="Example of last index value";
		 int n=str.lastIndexOf("s");
		 System.out.println(n);
		 int n2=str.lastIndexOf('a');
		 System.out.println(n2);
		 int n3=str.lastIndexOf('l', 10);
		 System.out.println(n3);
		 int n4=str.lastIndexOf("a", 10);
		 System.out.println(n4);
		 String replaceString=str.replaceAll('a','k');
		 System.out.println(str);
		 System.out.println(replaceString);*/
		/*String str="Replace method for replacing the string";
		String str2[]=str.split("\\s", 5);
		System.out.println(str2[4]);
		System.out.println(str.startsWith("Rep"));
		System.out.println(str.startsWith("method",8));
		String str3=str.substring(15, 12);
		System.out.println(str3);
		System.out.println();*/
		/*String st=" java t point ";
		System.out.println(st+" is very useful websites to learn the java");
		System.out.println(st.trim()+" i have been used this websites from long days onwards");
		*/
		String st1=new String("java");
		String st2=new String("java");
		String st3=new String("java");
		System.out.println(st1.hashCode());
		System.err.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		
	}
}
