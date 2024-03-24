package pack2;

public class StringClassF
{
 void meth1()
 {
	 StringBuffer sb=new StringBuffer();
	 System.out.println("Capacity:"+sb.capacity());//16
	 sb.append("abcd");
	 System.out.println("length:"+sb.length());//4
	 sb.append("efghijklmno");
	 System.out.println("buffer:"+sb+"(length is "+sb.length()+")");//15
	 sb.append("q");
	 System.out.println("Buffer:"+sb+"(length is "+sb.length()+")");//mutable 16
	 System.out.println("Capacity:"+sb.capacity()*2);//
	 System.out.println(sb.substring(sb.length()-2));
	 System.out.println(sb.reverse());
	 System.out.println(sb);
 }
 public static void main(String[] args) 
 {
	new StringClassF().meth1();
}
}
