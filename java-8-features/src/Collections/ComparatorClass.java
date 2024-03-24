package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	private Integer id;
	private String name;
	private Double sal;
	private String country;
	public Employee(Integer id, String name, Double i,String country) {
		super();
		this.id = id;
		this.name = name;
		this.sal = i;
		this.country=country;
	}
	public Employee(Integer id, String name, Double i) {
		super();
		this.id = id;
		this.name = name;
		this.sal = i;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", country="+country+"]";
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
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
}
class ComparatorId implements Comparator<Employee>//if we want sort with modifying the Employee we can use the compartor
{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getId()-e2.getId();//if it returns postive number it shif two second position if return negitive shift to first position internally;
	}
	
}
class ComparatorName implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
public class ComparatorClass {

	public static void compartorChecks()
	{
		Employee employee1 = new Employee(105,"venkatesh",23000d);
		Employee employee2 = new Employee(103,"Anji",25000d);
		Employee employee3 = new Employee(104,"Ayyappa",24000d);
		Employee employee4 = new Employee(102,"kasi eswara",26000d);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(employee4);al.add(employee3);al.add(employee2);al.add(employee1);
		al.forEach(System.out::println);
		System.out.println("********************8");
		Collections.sort(al,new ComparatorId());//this sorts id ->if we want sort name again we have to create another class
		al.forEach(System.out::println);
		System.out.println("****************88");
		Collections.sort(al,new ComparatorName());
		al.forEach(System.out::println);
		System.out.println("*******************");
		Collections.sort(al,new Comparator<Employee>()
				{
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getSal() > e2.getSal())
				{
					return -1;
				}
				else if(e1.getSal()<e2.getSal())
				{
					return 1;
				}
				return 0;
			}
				}
				);
		al.forEach(System.out::println);
	}
	public static void arithMeticOperations()
	{
		Employee employee1 = new Employee(105,"venkatesh",23000d,"India");
		Employee employee2 = new Employee(103,"Anji",25000d,"India");
		Employee employee3 = new Employee(104,"Ayyappa",24000d,"USA");
		Employee employee4 = new Employee(102,"kasi eswara",26000d,"Usa");
		List<Employee> li=List.of(employee1,employee2,employee3,employee4);
		System.out.println("********Min values*********");
		Optional<Employee> collect = li.stream().collect(Collectors.minBy(Comparator.comparing(x->x.getSal())));
		System.out.println("min"+collect.get().getSal());
		System.out.println("********* max value*******");
		Optional<Employee> max=li.stream().collect(Collectors.maxBy(Comparator.comparing(x->x.getSal())));
		System.out.println(max.get());
		System.out.println("********sum of and some arithmetic operations****");
		DoubleSummaryStatistics collect2 = li.stream().collect(Collectors.summarizingDouble(x->x.getSal()));
		System.out.println(collect2.getSum());
		Long collect3 = li.stream().count();
		System.out.println(collect3);
		System.out.println("********** Grouping operations*****");
		Map<String, List<Employee>> collect4 = li.stream().collect(Collectors.groupingBy(x->x.getCountry()));
		
		System.out.println(collect4.keySet()+" "+collect4.values());
	}
	 public static void main(String[] args) {
		//compartorChecks();
		arithMeticOperations();
	}
}
