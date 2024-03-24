package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee
{
	String name;
	String address;
	String designation;
	public Employee(String name, String address, String desg) {
		super();
		this.name = name;
		this.address = address;
		this.designation = desg;
	}
	
}
public class PredicateJoining {

	public static void main(String[] args) {
	Employee emp1=	new Employee("siva","bengloore", "software");
	Employee emp2=	new Employee("sitha","hyderabad", "accounts");
	Employee emp3=	new Employee("raju","hyderabad", "testing");
	Employee emp4=	new Employee("ramana","hyderabad", "testing");
	Employee emp5=	new Employee("rishi","bendlorr", "software");
    List<Employee> list=Arrays.asList(emp1,emp2,emp3,emp4,emp5);
  
    Predicate<Employee> p1=p->p.address.equals("hyderabad");
    Predicate<Employee> p2=p->p.designation.equals("accounts");
    Predicate<Employee> p33=p->p.name.startsWith("s");
    //join two predicates for mulitiple conditions
    Predicate<Employee> p3=p1.and(p2).and(p33);
    for(Employee e:list)
    {
    	if(p3.test(e))
    	{
    		System.out.println(e.name);
    	}
    	
    }
	}
	
}
