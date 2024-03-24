package prepInstaStrings;

public class RemoveSpaces 
{//data covert into arr and check the data store inside the string builder
  public static void main(String[] args) 
  {
	String s="siva krishna velpula";
	char c[]=s.toCharArray();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++)
	{//"\t"it indicates double spaces
		if(c[i]!=' '&&c[i]!='\t')//if spaces are available loop does not execute
		{
			sb.append(c[i]);
		}
		
	}
	System.out.println(sb);
	/*
	 
	String s1="siva krishna velpula";
	String st2=s1.replaceAll("[\\s]", "");//it remove spaces
	//\\s==>refers spaces 
	System.out.println(st2);
	*/
}
}
