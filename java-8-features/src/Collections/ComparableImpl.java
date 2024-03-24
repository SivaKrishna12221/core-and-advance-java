package Collections;

import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>
{
	private Integer id;
	public Student(Integer id, String name, Integer rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	@Override
	public int compareTo(Student o) {
		
	 return this.id-o.id;//it may return postive or negitive numbers it will arrange in order
		//return this.name.compareTo(o.name);//we can sort names
		//return o.name.compareTo(this.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	private String name;
	private Integer rank;
}
public class ComparableImpl {

	static void sortingIntegers()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(32);
		al.add(23);
		al.add(25);
		Collections.sort(al);//here integers internally implementing Comparable interface
		System.out.println(al);//it is possible to only integers
	}
	static void sortingForUserDefinedObjects()
	{
		Student student1= new Student(103,"siva",2);
		Student student2= new Student(101,"sitha",1);
		Student student3= new Student(102,"ravi",3);
		Student student4= new Student(105,"bekar",4);
		Student student5= new Student(104,"ram",5);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(student5);al.add(student4);al.add(student3);al.add(student2);al.add(student1);
		al.forEach(System.out::println);//insertion arder is maintaind
		//Collections.sort(al);//we cannot sort this user defined object if we want sort the user defined objects we have to implements Comparable interface 
		Collections.sort(al);
		System.out.println("======sorting using comparable interface====");
		al.forEach(System.out::println);
		
	}
	public static void main(String[] args) {
		//sortingIntegers();
		sortingForUserDefinedObjects();
	}
}
