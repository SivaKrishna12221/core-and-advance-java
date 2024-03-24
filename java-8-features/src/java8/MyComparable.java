package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparable implements Comparator<Integer>{
	@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
		 if(o1>o2)
		 {
			 return -1;//if a > b it doesn't swap
		 }
		 else if(o1<o2)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
		}

public static void main(String[] args) {
	List<Integer> ll=Arrays.asList(23,343,4354,42,232,434,345,54);
	//Collections.sort(ll,(a,b)->a.compareTo(b));
	System.out.println(ll);
	//Collections.sort(ll,new MyComparable());
	//System.out.println(ll);
	Collections.sort(ll,(a,b)->a>b?-1:1);//here we are internally using comparator interface
	System.out.println(ll);
}
}
