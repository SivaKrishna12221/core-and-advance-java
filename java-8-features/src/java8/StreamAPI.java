package java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Student {
	String name;
	Integer id;

	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
class Employee2
{
	String name;
	String desg;
	Double sal;
	public Employee2(String name, String desg, Double sal) {
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
}

public class StreamAPI {


	public static void intermediateOperation1() {

		Stream<Integer> st = Stream.of(23, 3434, 545, 2, 3, 3445, 54, 54, 43);// here we are passing the integer into
																				// stream to process
		Stream<Integer> str = st.filter(num -> num < 100);// here we are filter the number having greater than 1000 and
															// again the filter dataa is stored in the stream
		str.forEach(s -> System.out.println(s));// here for each internally using consumer interface taking the input
		//st.filter(num -> num > 100).forEach(n -> System.out.println(n));

	}

	public static void intermediateOperation2() {
		Student st=new Student("siva",23);
		Student st2=new Student("sitha",21);Student st3=new Student("ramu",23);Student st4=new Student("bekar",25);
         List<Student> li=List.of(st,st2,st3,st4);
                 
         li.forEach(System.out::println);
         System.out.println("********************");
         
     // li.stream().filter(stud->stud.name.startsWith("s")&& stud.id>20).forEach(t->System.out.println(t));
     li.stream().filter(stud->stud.name.endsWith("a"))
     .filter(stud->stud.id<25)
     .forEach(stu->System.out.println(stu));
	}
   public static void intermediateOperation3()
   {
	  List<String> li=List.of("ravi","raju","kalyan","kundan","sitha","siva");
	  //requriement finding names starts with s and transform into stream by returning its length
	  li.stream().filter(name->name.startsWith("s")).map(sname->sname+"-"+sname.length()).forEach(x->System.out.println(x));
   }
   public static void intermediateOperation4()
   {
	   Employee2 emp1 = new Employee2("dinesh","auditing",12000d);
	   Employee2 emp2 = new Employee2("ramana","software",22000d);
	   
	   Employee2 emp3 = new Employee2("rajesh","python developer",25000d);
	   
	   Employee2 emp4 = new Employee2("vishnu","software Developer",30000d);
	   List<Employee2> li=List.of(emp1,emp2,emp3,emp4);
	   //requirement find ename and job whose salary is greater than or equal 2000;
	  li.stream().filter(e->e.sal>=20000).forEach(x->System.out.println(x.name+" "+x.desg));
	  li.stream().filter(e->e.sal<=20000).map(x->x.name+" *"+x.desg).forEach(s->System.out.println(s));
	 li.stream().limit(3).forEach(System.out::println);
	  System.out.println("************88888");
	 li.stream().skip(3).forEach(System.out::println);
	   
   }
   @SuppressWarnings("unlikely-arg-type")
public static void terminalOperation01()//terminal operations means it gives result directly it does not return true
   {
	   Employee2 emp1 = new Employee2("dinesh","auditing",12000d);
	   Employee2 emp2 = new Employee2("ramana","software",22000d);
	   
	   Employee2 emp3 = new Employee2("rajesh","python developer",25000d);
	   
	   Employee2 emp4 = new Employee2("vishnu","software Developer",30000d);
	   List<Employee2> li=List.of(emp1,emp2,emp3,emp4);
	   boolean anyMatch = li.stream().anyMatch(x->x.name.equalsIgnoreCase("vishnu"));
	  System.out.println("is vishnu present"+anyMatch);
	  boolean allMatch = li.stream().allMatch(x->x.name.equals("dinesh"));
	  System.out.println("is all are matching with dinesh "+allMatch);
	  
	  boolean noneMatch = li.stream().noneMatch(x->x.name.equals("dinesh"));
	  System.out.println("is no one mathching to the dinesh "+noneMatch);
   }
   public static void mathOperation()
   {
	   Employee2 emp1 = new Employee2("dinesh","auditing",12000d);
	   Employee2 emp2 = new Employee2("ramana","software",22000d);
	   
	   Employee2 emp3 = new Employee2("rajesh","python developer",25000d);
	   
	   Employee2 emp4 = new Employee2("vishnu","software Developer",30000d);
	   List<Employee2> li=List.of(emp1,emp2,emp3,emp4);
	   
   }
	public static void main(String[] args) {

    //intermediateOperation1();
	//	intermediateOperation2();
	//	intermediateOperation3();
   //intermediateOperation4();
	//	terminalOperation01();
		
	}
}
