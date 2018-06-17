

public class Method 
{
	void cal()
	{
		System.out.println("This is first method");
	}
	
	void cal(int rollno,String name) 
	{
		System.out.println(rollno+name);
	}
	void cal(String name,int rollno)
	{
		
	}
	
public static void main(String args[])
{
	Method m1=new Method();
	Method m2=new Method();
	m1.cal();
	m1.cal(10," Rupali");
	/*m1.cal("Rupali  ",20);*/
	m2.cal();
	m2.cal(30," Dipali");
	/*m2.cal("Amar",40);*/
}
}
