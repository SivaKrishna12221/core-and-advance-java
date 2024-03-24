package pack2;

public class UserdefinedObjectA 
{
   int Bcode;
   String Bname;
   String Bloc;
   
public UserdefinedObjectA(int bcode, String bname, String bloc)
{
	
	this.Bcode = bcode;
	this.Bname = bname;
	this.Bloc = bloc;
}

@Override
public String toString() 
{
	return + Bcode + " " + Bname + " " + Bloc ;
}

   
   
}
 

