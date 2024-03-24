package prepInstaStrings;

public class RemoveCharactersInaString 
{
  public static void main(String[] args)
  {
	  String s="s53$%3i534v%#a";
	  s=s.replaceAll("[^a-zA-Z]","");
	  System.out.println(s);
    
   
}
}
