package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorClass implements Comparator<Integer>//functional interface ->method-> int compare(T o1, T o2);
{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)//if a > b dont do swapping 
		{
			return -1;
		}
		else if(o1<o2)
		{
			return 1;
		}
		return 0;
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		List<Integer> ll=Arrays.asList(23,343,4354,42,232,434,345,54);
		System.out.println(ll);
		Collections.sort(ll, new ComparatorClass());
		System.out.println(ll);
	}
}
