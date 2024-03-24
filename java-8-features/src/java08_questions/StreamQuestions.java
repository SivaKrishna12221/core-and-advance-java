package java08_questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	private Integer empid;
	private String ename;
	private String desg;
	private Double sal;
	private  String gender;
	private  Integer year;
	public Employee(Integer empid, String ename, String desg, Double d, String gender, Integer year) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desg = desg;
		this.sal = d;
		this.gender = gender;
		this.year = year;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + ", gender="
				+ gender + ", year=" + year + "]";
	}
	
}
public class StreamQuestions {

	public static void groupingDataUsingGender()
	{
	
		Employee e1 = new Employee(101, "varun","HR", 25000d, "male", 2011);
		Employee e2 = new Employee(102, "mohith","development", 22300d, "male", 2014);
		Employee e3 = new Employee(103, "vijayendra","security",27000d, "male", 2016);
		Employee e4 = new Employee(104, "hari","accountant", 35000d, "male", 2014);
		Employee e9 = new Employee(109, "hemanth","sales", 2670d, "male", 2012);
		Employee e10 = new Employee(109, "siri","assistant", 29800d, "female", 2015);
		Employee e11 = new Employee(109, "sravya","banking", 23570d, "female", 2019);
		Employee e12 = new Employee(109, "manju","infrastructur", 29790d, "female", 2018);
        Employee e5 = new Employee(105, "sudharshan","python developer", 32000d, "male", 2019);
		Employee e6 = new Employee(106, "uvsk","testing", 28000d, "male", 2012);
		Employee e7 = new Employee(107, "tharun","UI", 31000d, "male", 2022);
		Employee e8 = new Employee(108, "ramana","finance", 25600d, "male", 2021);
		Employee e13 = new Employee(109, "pravalika","devops", 29000d, "female", 2023);
       List<Employee> lis = List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13);
       //find no.of womens and mens working in the company
       Map<String, Long> maleAndFemale = lis.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(maleAndFemale);
       //find no.of employees join in the year ///group based on year
       Map<Integer, Long> groupBasedOnyear = lis.stream().collect(Collectors.groupingBy(Employee::getYear,Collectors.counting()));
       System.out.println(groupBasedOnyear);
       //print the names of all desgination in the company
       lis.stream().map(d->d.getDesg()).forEach(System.out::println);
       System.out.println("********************");
       //what is the average sal of male and female in the company
       Map<String, Double> averageSalOfMaleAndFemale = lis.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(x->x.getSal())));
       System.out.println(averageSalOfMaleAndFemale);
       //GetHighest paid employee in the organisation
       Optional<Employee> maxOfsal = lis.stream().collect(Collectors.maxBy(Comparator.comparing(x->x.getSal())));
       System.out.println(maxOfsal.get().getEname()+" "+maxOfsal.get().getSal());
       //get all employee details who are joined of 2015
       lis.stream().filter(x->x.getYear()>2015).forEach(System.out::println);
       //count no.of employee in each gender
       Map<String, Long> countGenders = lis.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(countGenders);
	}
	public static void main(String[] args) {
		groupingDataUsingGender();
	}
}
