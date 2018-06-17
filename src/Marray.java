public class Marray{  
	
public static int getM(int[] a,int n){  
 int temp;
for (int i = 0; i < n; i++) 
	
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[n-1];  
}  
public static void main(String args[]){  
int a[]={10,34,32,45,35,78,56};  

System.out.println("Largest Number: "+getM(a,6));  
  
}}  

