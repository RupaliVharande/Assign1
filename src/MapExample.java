import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapExample 
{
     Map<Integer,String> m1;
    public void	addElementsToHashMap()
	{
    	m1=new HashMap();
    	m1.put(10,"hhbkbkjbkj");
		m1.put(200,"skljkqljq");
		m1.put(7676,"Jfwjsgcsg");
		
	}
    public void addElementsToLinkedHashMap()
    {
    	m1=new LinkedHashMap();
    	m1.put(10,"hhbkbkjbkj");
		m1.put(200,"skljkqljq");
		m1.put(7676,"Jfwjsgcsg");
    }
    public void addElementsToTreeMap()
    {
    	m1=new TreeMap();
    	m1.put(10,"hhbkbkjbkj");
		m1.put(200,"skljkqljq");
		m1.put(7676,"Jfwjsgcsg"); }
    public void display()
    {
         System.out.println(m1);
         Set<Integer> keys=m1.keySet();
         for(Integer it:keys)
         {
        	 System.out.println(m1.get(it));
         }
    }
    
}
