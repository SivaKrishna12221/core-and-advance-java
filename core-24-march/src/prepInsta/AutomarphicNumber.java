package prepInsta;

public class AutomarphicNumber //376 square is 1,41,376 it is automarphic number euals to end numbers of square
{
	public static void main(String[] args) 
	{
	  int num=26;
	  int square=num*num;
	  if(isAutomarphic(num)==1)
	  {
		  System.out.println("number:"+num+",square:"+square+" -is automarphic");
	  }
	  else
	  {
		  System.out.println("number:"+num+",square:"+square+" -is not automarphic");
	  }
       
	}
	static int isAutomarphic(int num)
	{
		int square=num*num;
		while(num!=0)             //25==625
		{
			//means it is not automarphic
			if(num%10!=square%10)//5!=5//false so reamining
				return 0;
			//reduce down the number
			num/=10;
			square/=10;
		}
		//if reaches here automarphic number
		return 1;
		
	}
}
