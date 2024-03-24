package javatPointString;

public class ClassStringbuilder 
{
 public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("java");
	sb.append("is awesome");
	System.out.println(sb);
	sb.insert(7 ,", fabulous");
	System.out.println(sb.replace(6,10,"fantastic"));
	System.out.println(sb.delete(6,10));
	System.out.println(sb.reverse());
	System.out.println(sb.charAt(10));
	System.out.println(sb.indexOf("l"));
	StringBuilder sb1=new StringBuilder("hello world");
	sb1.append("how are you friends");
	System.out.println(sb1);
	sb1.insert(10,"mama");
	System.out.println(sb1);
	sb1.delete(10,14);
	System.out.println(sb1);
	
}
}
