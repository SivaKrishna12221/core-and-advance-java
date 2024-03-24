package pack3;

import java.util.Scanner;
 
public class ClassA
{
	 static Scanner sc = new Scanner(System.in);
			
	void meth1()
	{
		System.out.println("Implementing Scanner class");
		System.out.println("Please enter a value:");
		int a=sc.nextInt();
		System.out.println("Value of a is :"+a);
		System.out.println("Please enter b value:");
		int b=sc.nextInt();
		System.out.println("Value of b is :"+b);
		
		int c=a+b;
		System.out.println("Addtion:"+c);
		
		
	}
	void person()
	{
		System.out.println("Please enter your name:");
		String name=sc.nextLine();
		System.out.println("hi"+name+"!!");
		
	}
	void voteEligibility(String name,int age)
	{
		if(age>=18)
		{
			System.out.println(name+ " as your age is " +age+ " your eligible to vote");
		}
		else
		{
			System.out.println(name+"as your age is "+age+"your not eligible to vote");
		}
	}
	public static void main(String[] args) 
	{
		//new ClassA().meth1();
		//new ClassA().person();
		System.out.println("What is your name ?");
		String name= sc.nextLine();
		System.out.println("What is your age?");
		int age=sc.nextInt();
		
		new ClassA().voteEligibility(name,age);
		
	}

}

