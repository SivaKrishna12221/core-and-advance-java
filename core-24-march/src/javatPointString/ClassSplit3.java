package javatPointString;

public class ClassSplit3
{
  public static void main(String[] args)
  {
	String s="prpinstaaa"; 
	String str[]=s.split("p",0);//from i position onwards words divided into lines
	
	for(String string:str)
	{
		System.out.println(string);
	}
	System.out.println("spliting arr length:"+str.length);
}
}
/*
prep
nstaaa
spliting arr length:2
*/