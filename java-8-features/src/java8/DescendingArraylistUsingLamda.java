package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingArraylistUsingLamda {
   public static void main(String[] args) {
	   List<Integer> ll=Arrays.asList(23,343,4354,42,232,434,345,54);
		System.out.println(ll);
	  Collections.sort(ll,(a,b)->a.compareTo(b));//here we are using compareTo method to compare a and b that internally using compare method 
	  System.out.println(ll);
	  Collections.sort(ll,(a,b)->a>b?-1:1);//here we are using comparator interface having compare method it checks and returns  if a>b  it does not swap means it returns -1 other wise returns 1
	  System.out.println(ll);
	  
}
}
