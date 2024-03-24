package pack3;

public class Person
{
	String name;
	
	Person()
	{
		this("Abdul Kalam Azad");
		this.display();
		
	}
	Person(String name)
	{
		this.name=name;//Abdul Kalam Azad
	}
	void display()
	{
		System.out.println("Person name is="+name);
		
	}

	public static void main(String[] args) 
	{
		Person p =new Person();
		
	}
}
