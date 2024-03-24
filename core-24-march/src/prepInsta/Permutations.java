package prepInsta;

import java.util.Scanner;

public class Permutations 
/*
 * Problem Statement :
   In a classroom some of the seats are already occupied by 
   students and only a few seats are available in the classroom.
    The available seats are assumed as r and n number of students
     are looking for the seat. We need to find in how many different 
    permutations n number of students can sit on r number of chairs.
 *
 *use r=no.of seats
 *use n=no.of persons
 *use permutation formula=>n p r=n!/(n-r)!
 */
{
  public static void main(String[] args)
  {
	int n,r,permutation,factorial1,factorial2;
	Scanner sc=new Scanner (System.in);
	System.out.println("please enter number of persons;");
	n=sc.nextInt();
	System.out.println("please enter number of seats");
	r=sc.nextInt();
	
	factorial1=1;
	for(int i=2;i<=n;i++)
	{
		factorial1=factorial1*i;
	}
	factorial2=1;
	int number=n-r;
	for(int i=2;i<=number;i++)
	{
		factorial2=factorial2*i;
	}
	permutation=factorial1/factorial2;
	System.out.println("permutation of persons and seats is:"+permutation);
}
}
