package javatPointString;

public class ClassReplaceAll
{
  public static void main(String[] args) {
	String s1="My name is Siva .my name is Ram.my name is Sitha";
	String s2=s1.replace("is","will");
	/*
	 * Java String class replace method returns a new string replacing old character sequance to new character sequance 
	 * Java string class replace all method returns a string replacing all the sequance of characters with new character Sequance
	 */
	System.out.println("replace()"+s2);
	String s3=s1.replaceAll("a","i");
	System.out.println("replaceAll()"+s3);
	String s4="javatpoint";
	String s44="";
	String s5=s4.replaceAll(s44," ");
	System.out.println(s5);
}
}
