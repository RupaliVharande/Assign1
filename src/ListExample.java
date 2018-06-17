import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class ListExample 
    {
	List<String> l1;
     public void addElementsToArrayList()
       {	
        l1=new ArrayList<String>();
     	l1.add("fgjbdfg");
 		l1.add("Qqii");
 		l1.add("pppndsjfjy");
       }
     public void addElementsToLinkedList()
     {
    	 
    	l1=new LinkedList();
     	l1.add("fgjbdfg");
 		l1.add("Qqii");
 		l1.add("pppndsjfjy");
     }
     public void addElementsToVector()
     {

     	l1=new Vector();
     	l1.add("fgjbdfg");
 		l1.add("Qqii");
 		l1.add("pppndsjfjy");
     }
     public void display()
     {
          System.out.println(l1); 
          
          for(String s1:l1)
          {
        	  System.out.println(s1);
          }
     }

}
