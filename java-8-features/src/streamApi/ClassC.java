package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassC {
 void meth1()
 {
	 System.out.println("Java8 streams are used to manipulate the data");
	 System.out.println("streams are used to read the data not save the data");
	 ArrayList <String>al=new ArrayList();
	 al.add("siva");
	 al.add("ram");
	 al.add("ravi");
	 al.add("raghu");
	 al.add("raju");
	 al.add("varma");
	 Stream s1=al.stream();/*.forEach(x->System.out.println(x));*/
	 //s1.forEach(x->System.out.println(x));
	// s1.filter(x->x=="ravi").forEach(System.out::println );
	 List<String> al2=(List<String>) s1.sorted().collect(Collectors.toList());//;.forEach(System.out::println);
	 //.forEach(System.out::println);
	 System.out.println(al2);
 }
 void meth2()
 {
	 
 }
 public static void main(String[] args) {
	new ClassC().meth1();
}

}
