package prepInsta;

import java.util.Arrays;

public class BinaryToOctal {
	
	public static void main(String[] args) {
		int binary=110011;
		int num=0;
		int decimal=0;
		while(binary!=0)
		{
			int rem=binary%10;
			decimal=decimal+rem*(int)Math.pow(2,num);
			binary/=10;
			num++;
		}
		System.out.println(decimal+"decimal value");
		int oct[]=new int[20];
		int i=0;
		while(decimal!=0) {
			int rem=decimal%8;
		    oct[i++]=rem;
		    decimal/=8;
		    
	}
		for(int j=i;j>0;j--)
		{
			System.out.print(oct[j]+" ");
		}
	}
}
