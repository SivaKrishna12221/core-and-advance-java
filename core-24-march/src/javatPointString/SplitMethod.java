package javatPointString;

public class SplitMethod
{
 public static void main(String[] args) {
	String s="first time i am learning split method ";
	//here the sentence converts into words format
	String words[]=s.split("\\s");//it contains words
	//in order to retrive the words one to one 
	//here we are using for each
	for(String str:words)//here we store string data comming from words array
	{
		System.out.println(str);
	}
 }
}
