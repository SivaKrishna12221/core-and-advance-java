package collectionFrames;

import java.util.ArrayList;

public class ClassArrayList
{
 public static void main(String[] args)
 {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(new Integer(0));
	al.add(new Integer(0));
	al.add(new Integer(0));
	al.add(new Integer(0));
	al.add(new Integer(2));
	for(int j=0;j<al.size();j++)
	{
		int k=al.get(j);
		if(k==0)
		{
			System.out.println("im");
			al.remove(j);
		}
		else
		{
			al.get(j);
		}
		
	}
	System.out.println(al.toString());
}
}
