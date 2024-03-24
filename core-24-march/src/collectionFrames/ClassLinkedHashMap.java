package collectionFrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ClassLinkedHashMap 
{
 void meth1()
 {
	System.out.println("implementing linked hash map");
	LinkedHashMap<Object,Object> hmap=new LinkedHashMap<Object,Object>();
	hmap.put(101,"html");//Insertion order is maintained
	hmap.put(103,102);//heterogeneous data allowed
	hmap.put(108,"clanguage");//duplicate keys are not allowed
	hmap.put(null, null);//nulls are allowed.
	hmap.put(105,"html");//duplicate values are allowed
	hmap.put("orange",106);//default capacity is 16;
	hmap.put(108,"clanguage" );//its not synchronized
	System.out.println(hmap);
	HashSet<Object> hs=new HashSet<Object>(hmap.keySet());//here taking the key values only
    System.out.println("keys:"+hs);
    Iterator<Object> i=hs.iterator();//here method returns the object and it stores inside the Iterator class
    /*
     * iterator is an interface contains methods like hasNext,next,and retrieve the collection object;
     */
    System.out.println("retrive the data by using iterator interaface");
    while(i.hasNext())//it returns if the iterator has more elements
    {
    	System.out.println(i.next());
    }
    
 }
 public static void main(String[] args) 
 {
	ClassLinkedHashMap aobj=new ClassLinkedHashMap();
	aobj.meth1();
}
}
