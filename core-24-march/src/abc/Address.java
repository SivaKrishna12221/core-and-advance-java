package abc;

public class Address 
{
  String village;
  String district;
  String state;
  public Address(String village,String district,String state)
  {
	  this.village=village;
	  this.district=district;
	  this.state=state;
  }
  public String toString()
  {
	  return "village:"+village+"district: "+district+"state "+state;
  }
}
