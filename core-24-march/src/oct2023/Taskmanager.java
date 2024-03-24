package oct2023;

import java.util.LinkedList;
import java.util.Scanner;

import pack1.Test;

public class Taskmanager 
{
 public void meth1()
 {
	 LinkedList<Task> li=new LinkedList<Task>();
	 Scanner sc=new Scanner(System.in);
     System.out.println("*******Welcome to TaskManager*******");
     System.out.println("1.Enter 1 for writing the description");
     System.out.println("2.Enter 2 for view the tasks");
     System.out.println("3.Exit 3 exit from the page");
     int number=sc.nextInt();
     sc.nextLine();
     switch (number)
     {
     case 1:
     {
    	 System.out.println("write a description about :");
    	  String description=sc.nextLine();
    	Task task=new Task(description);
    	  li.add(task);
    	  System.out.println("test is:"+description);
    	  new Taskmanager().meth1();
    	  break;
     }
     case 2:
     {
    	 for(Task s:li)
    	 {
    		 System.out.println("task details is::");
    		 System.out.println(s);
    		 new Taskmanager().meth1();
    		 break;
    	 }
     }
     case 3:
     {
    	 System.out.println("existing from task manager:");
    	 sc.close();
    	 System.exit(0);
    	 new Taskmanager().meth1();
    	 break;
     }
    	 default:
    	 {
    	 System.out.println("invalid choice:try again later");
    	 new Taskmanager().meth1();
    	 sc.close();
    	 break;
    	 }
     }
     
 }
 public static void main(String[] args) {
	new Taskmanager().meth1();
}
}
