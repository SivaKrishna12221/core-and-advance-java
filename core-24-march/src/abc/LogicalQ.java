package abc;

import java.util.Arrays;
import java.util.Scanner;

public class LogicalQ {
	// octal to decimal
	public static void main(String[] args) {

	arrayMultiplier(2);
	}
	public static void arrayMultiplier(int number)
	{
		int[] a= {1,2,3};
		int i=0,j=0;
		while(j!=a.length)
		{
			a[i] *=number;
			j+=2;
		}
		System.out.println(Arrays.toString(a));

	}
}
