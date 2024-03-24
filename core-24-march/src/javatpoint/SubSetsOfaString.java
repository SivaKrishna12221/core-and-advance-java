package javatpoint;

import java.util.Arrays;

public class SubSetsOfaString {

	public static void main(String[] args) {
		String st1="practising ";
		System.out.println(st1.length());
		int n=st1.length();
		int size=n*(n+1)/2;
		System.out.println(size);
		String []narr=new String[size];
		int incre=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				narr[incre]=st1.substring(i,j+1);
				incre++;
			}
		}
		System.out.println(Arrays.toString(narr));
		
	}
}
