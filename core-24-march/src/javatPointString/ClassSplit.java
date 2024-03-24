package javatPointString;

import java.util.Arrays;

public class ClassSplit {
public static void main(String[] args) {
	//The java string split method splits the string against given regualar expression and returns a char array;
	String s1="java string split method split the given  spring  according to regualar expression aan returns a char array";
	String s2[]=s1.split("a",8);
 System.out.println(Arrays.toString(s2));
 for(String s:s2)
 {
	 System.out.println(s);
 }
}
}
