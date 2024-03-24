package java8;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
	 StringJoiner joiner=	new StringJoiner("-");
	 joiner.add("siva");
	 joiner.add("krishna");
	 joiner.add("velpula");
	 System.out.println(joiner);
	 StringJoiner joiner2= new StringJoiner("-","(",")");
	 joiner2.add("sitha");
	 joiner2.add("ram");
	 System.out.println(joiner2);
	}
}
