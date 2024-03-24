package pack2;

public class FamilyA 
{
	int Number;
	String Person;
	int age;
	public FamilyA(int number, String person, int age) 
	{
	
		this.Number = number;
		this.Person = person;
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return  Number + " " + Person + " " +"age-"+ age ;
	}
	

}
