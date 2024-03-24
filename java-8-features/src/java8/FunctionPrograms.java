package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;
interface MyInterface
{
	public void desc();
}

class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
		{
			return 1;
		}
		else if(o1<o2) {
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}
public class FunctionPrograms {

	public static void meth2()
	{
		List<Integer> li=Arrays.asList(34,545,23,54,65,23);
		System.out.println(li);
		Collections.sort(li,new MyComparator());
		System.out.println(li);
	}
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bip=(a,b)->(a+b)>=10;
		System.out.println(bip.test(30, 30));
		
		BiConsumer<String,Integer> bic=(s,i)->System.out.println(s+" "+i);
		bic.accept("siva", 23);
		
		Function<String,Integer> fun= str->str.length();
	    System.err.println(fun.apply("siva"));
	    System.out.println(fun.apply("ravi"));
	    
	   MyInterface mi=FunctionPrograms::meth2;
	   mi.desc();
	}
}
