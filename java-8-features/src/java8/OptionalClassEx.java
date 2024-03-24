package java8;

import java.util.Optional;

public class OptionalClassEx {

	public static String getUsername(Integer id)
	{
		String name=null;
		if(id==100)
		{
			name="siva";
		}
		else if(id==101)
		{
			name= "sitha";
		}
		 return name;
		
	}
	public static Optional<String> getUser(Integer id)
	{
		String name=null;
		if(id==100)
		{
			name="siva";
			
		}
		else if(id==101)
		{
			name="sitha";
		}
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		
		String result=getUsername(104);
		System.out.println(result);
		Optional<String> result2=getUser(100);
		if(result2.isPresent())
		{
			String result3=result2.get();
			System.out.println(result3);
		}
		else
		{
			System.out.println("invalid id");
		}
	    System.out.println(result);
	}
}
