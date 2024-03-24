package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class ClassSort 
{
  @SuppressWarnings("unchecked")
public static void main(String[] args) 
  {
	int num=4231;
	int temp=0;
	ArrayList al=new ArrayList();
	while(num!=0)
	{
		int rem=num%10;
		
		al.add(rem);
		num/=10;
		
	}
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	for(int i=al.size()-1;i>=0;i--)
	{
		
	}
}
}
