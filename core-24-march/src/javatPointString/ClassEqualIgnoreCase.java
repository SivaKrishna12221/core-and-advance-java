package javatPointString;

import java.util.ArrayList;

public class ClassEqualIgnoreCase
{
  public static void main(String[] args) {
	String str1="Mukesh Kumar";
	ArrayList<String> list=new  ArrayList<>();
    list.add("Mohan");
    list.add("Mukesh");
    list.add("RAvI");
    list.add("MuKesh kuMar");
    list.add("Suresh");
    for(String s:list)
    {
    	if(str1.equalsIgnoreCase(s))
    	System.out.println("Mukesh is present");
    }
}
}
