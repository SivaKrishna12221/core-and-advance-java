package javatpoint;

import java.util.Arrays;

public class StringMultipleParts {

	public static void main(String[] args) {
		String s="Siva krishna velpula";
		int n=3;
		int lengthOfParts=s.length()/3;
		String str[]=new String[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			str[i]=s.substring(k, k+lengthOfParts);
			k=k+lengthOfParts;
		}
		for(String st:str)
		{
			System.out.print(st+",");
		}
		
		
		
	}
}
