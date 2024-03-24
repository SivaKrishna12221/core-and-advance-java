package pack2;

public class ClassM 
{
	String name;
	int Id;
	static String company="TCS";
	
	ClassM(String empname,int empId)//calling from main empname=kishan,empId=101;
	{
		name=empname;//kishan 
		Id=empId;//101;
		
	}
	public static void main(String[] args)
	{
		ClassM aobj1=new ClassM("Kishan",101);//creating a constructor name=Kishan,Id =101
		ClassM aobj2=new ClassM("Sujatha",102);
		ClassM aobj3=new ClassM("Siva",103);
		System.out.println(aobj1.name+" "+aobj1.Id+" "+ClassM.company);
		System.out.println(aobj2.name+" "+aobj2.Id+" "+ClassM.company);
		System.out.println(aobj3.name+" "+aobj3.Id+" "+ClassM.company);
		
	}

}
