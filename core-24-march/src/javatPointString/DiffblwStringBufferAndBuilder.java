package javatPointString;

public class DiffblwStringBufferAndBuilder 
{
/*
 * stringBuffer:It is synchronized .means two threads cant call the methods simultaneously
 * StirngBuilder:It is not synchronize .means two threads can call the methods simultaneously
 */
 public static void main(String[] args)
 {
	StringBuffer buffer=new StringBuffer("siva");
	long startTime=System.currentTimeMillis();
	
	
	for(int i=0;i<2000;i++)
	{
		buffer.append("krishna");
		
	}
	System.out.println("time taken by string buffer:"+(System.currentTimeMillis()-startTime)+"ms");
	
	StringBuilder builder=new StringBuilder("siva");
	long secStartTime=System.currentTimeMillis();
	
	
	for(int i=0;i<2000;i++)
	{
		builder.append("ram");
	}
	System.out.println("time taken for string builder:"+(System.currentTimeMillis()-secStartTime)+"ms");
}
}//time taken by string buffer:1ms
//time taken for string builder:0ms

