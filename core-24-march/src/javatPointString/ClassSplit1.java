package javatPointString;

import java.util.Arrays;

public class ClassSplit1 
{
 public static void main(String[] args) {
	String s1="now i am practicing string split concepts";
	String sentences[]=s1.split("\\s");
	System.out.println(Arrays.toString(sentences));
	for(String str:sentences)
	{
		System.out.println(str);
	}
}
}
