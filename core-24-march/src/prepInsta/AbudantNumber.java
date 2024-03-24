package prepInsta;

public class AbudantNumber 
/*
 * The sum of factors of a given Number except its own number 
 * is grater than its own number is known as Abudant number
 * 
 * 18==>1+2+3+6+9=21    21>18
 */
{
	public static void main(String[] args) 
	{
		int num=120;
	    int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}
	    if(sum>num)
	    {
	    	System.out.println("abudant number");
	    }
	    else
	    	System.out.println("not abudant number");
	}

}
