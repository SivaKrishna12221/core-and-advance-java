package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Person
{
	private String name;
	private Integer age;
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
public class FindAgeOfPersonUsingPredicate {

	public static void main(String[] args) {
          ArrayList<Person> al=new ArrayList<Person>();
          al.add(new Person("siva",21));
          al.add(new Person("ramana",23));
         Predicate<Person> per= p->p.getAge()>20;
         for(Person p:al)
         {
        	if( per.test(p))
        	{
        		System.out.println(p.getName());
        	}
         }
          
	}
}
