package prepInstaStrings;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceAparticularString
{
	
	static void isRemove(String s1,String word)
	{
		String a_str[]=s1.split(" ");
		String new_str="";
		//Iterating the string using for each loop
		for(String str2:a_str)
		{
			if(!str2.equals(word))//if remove word and string word is same it returns flase
				
			{
				//concat the word not equal to the given word
				
			   new_str=new_str+str2+" ";
			}
			
		}
		System.out.println(new_str);
	}
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter one line of sentence");
	String s1=sc.nextLine();
	System.out.println("please enter which word do you want to remove");
	String word=sc.nextLine();
	isRemove(s1,word);
}
}

