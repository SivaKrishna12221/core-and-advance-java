package pack1;
/*
 * Encapsulation:Encapsulation means it is a process of making fields 
 * as a private and providing access to those fields with the help of 
 * public methods (i.e setters and getters method).
 */

public class MahanandiComputationWinners 
{
   private int PrizeMoney;
   private String OwnerName;
   private String Address;
   private int Score;
 
   
   public int getPrizeMoney()
   {
	   return PrizeMoney;
   }
   public void  setPrizeMoney(int PrizeMoney)
   {
	   System.out.println(+PrizeMoney+" entered");
	   this.PrizeMoney=PrizeMoney;
   }
   public String getOwnerName()
   {
	   return OwnerName;
   }
   public void  setOwnerName(String OwnerName)
   {
	   System.out.println(OwnerName+" entered");
	   this.OwnerName=OwnerName;
	   
   }
   public String getAddress()
   {
	   return Address;
   }
   public void setAddress(String Address)
   {
	   System.out.println(Address+" Entered");
   }
   public int getScore()
   {
	   return Score;
	   
   }
   public void setScore(int Score)
   {
	   System.out.println(Score+" Entered");
	   this.Score=Score;
   }
   
}
