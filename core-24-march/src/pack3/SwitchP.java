package pack3;

public class SwitchP
{
  void meth1(char operator,int num1,int num2)
  {
	  System.out.println("Implementing switch ");
	  
	  switch(operator)
	  {
	  case '+':
		  System.out.println("Addition:"+(num1+num2));
	  break;
	  case '-':
		  System.out.println("substraction:"+(num1-num2));
		  break;
	  case '*':
		  System.out.println("multiplication:"+(num1*num2));
		  break;
	  case '/':
		  System.out.println("division:"+(num1/num2));
		  
		 default:
			 System.out.println("invalid input");
	  }
	  
  }
  public static void main(String[] args) 
  {
	  new SwitchP().meth1('/',20,10);
	
}
}
