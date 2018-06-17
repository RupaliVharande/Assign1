import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetExample 
{
	Set<String> s2;
    public void	addElementsToHashSet()
	{
    	
		s2=new HashSet<String>();
		s2.add("fgjbdfg");
		s2.add("Qqii");
		s2.add("pppndsjfjy");
		
	}
    
    public void addElementsToLinkedHashSet()
    {
    	s2=new LinkedHashSet<String>();
    	s2.add("fgjbdfg");
		s2.add("Qqii");
		s2.add("pppndsjfjy");
		
    }
    public void addElementsToTreeSet()
    {
    	s2=new TreeSet();
    	s2.add("fgjbdfg");
		s2.add("Qqii");
		s2.add("pppndsjfjy");
		 }
    public void display()
    {
     
    	System.out.println(s2);   
    	
    	Iterator<String> itr=s2.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    }

}
