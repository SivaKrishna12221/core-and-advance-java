package prepInstaStrings;

public class ReplaceAword 
{
  public static void main(String[] args) 
  {
	String str="This is the prepinsta";
	String word="the";
	str=str.replaceAll(word,"");
	str=str.trim();
	System.out.println(str);
			
}
  
}
