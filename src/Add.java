
class Add
{
	public static void main(String[] args) 
	{
		SetExample s1=new SetExample();
		s1.addElementsToHashSet();
		s1.display();
		s1.addElementsToLinkedHashSet();
		s1.display();
		s1.addElementsToTreeSet();
		s1.display();
		
		ListExample l2=new ListExample();
		l2.addElementsToArrayList();
		l2.display();
		l2.addElementsToLinkedList();
		l2.display();
		l2.addElementsToVector();
		l2.display();
		
		MapExample m2=new MapExample();
		m2.addElementsToHashMap();
		m2.display();
		m2.addElementsToLinkedHashMap();
		m2.display();
		m2.addElementsToTreeMap();
		m2.display();
		
	}
	
}