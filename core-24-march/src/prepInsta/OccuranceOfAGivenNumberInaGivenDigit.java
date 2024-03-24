package prepInsta;

import java.util.Scanner;

public class OccuranceOfAGivenNumberInaGivenDigit
/*
 * by elimination process compare remainder and digit 
 * if it occurs count 
 */
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your number:");
		int number=sc.nextInt();
		System.out.println("Please enter occurance digit:");
		int digit=sc.nextInt();
		int occurance=0;
		while(number!=0)
		{
			int rem=number%10;
			if(rem==digit)
				occurance++;
			number/=10;
		}
		System.out.println(occurance);
	}

}
