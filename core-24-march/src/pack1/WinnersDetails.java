package pack1;

import java.util.Scanner;

public class WinnersDetails
{
  Scanner sc=new Scanner(System.in);
  void display()
  {
	  MahanandiComputationWinners aobj=new MahanandiComputationWinners(); 
	  System.out.println("Enter the prize money amount");
	  aobj.setPrizeMoney(sc.nextInt());
	  System.out.println("Enter the owner name");
	  aobj.setOwnerName(sc.next());
	  System.out.println("Enter the Address ");
	  aobj.setAddress(sc.next());
	  System.out.println("Enter the score");
	  aobj.setScore(sc.nextInt());
	  System.out.println("prizeMoney:"+aobj.getPrizeMoney());
	  System.out.println("OwnerName:"+aobj.getOwnerName());
	  System.out.println("Address:"+aobj.getAddress());
	  System.out.println("Score:"+aobj.getScore());
	  sc.close();
  }
  
  public static void main(String[] args)
  {
	WinnersDetails wd=new WinnersDetails();
	wd.display();
}
  
}
