package stringHandling;

import java.util.Scanner;

public class ClassGender 
{
 void meth1()
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("please specify the gender:");
	char gender=sc.next().charAt(0);
	switch(gender)
	{
	case 'M':
		System.out.println("user is male");
		break;
	case 'm':
		System.out.println("user is male");
		break;
	case 'F':
		System.out.println("user is female");
		break;
	case 'f':
		System.out.println("user is female");
		break;
	default:
		System.out.println("invalid input");
	}
	
 }
 public static void main(String[] args) 
 {
	ClassGender aobj=new ClassGender();
	aobj.meth1();
	
}
}
