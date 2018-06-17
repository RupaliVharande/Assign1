
class Rstring
{
    public static void main(String[] args)
    {
        String input = "Rupali";
 
        
        byte [] str = input.getBytes();
 
        byte [] result =new byte [str.length];
 
        for (int i = 0; i<str.length; i++)
            result[i] = 
             str[str.length-i-1];
 
        System.out.println("Reverse string of input string is:  " +new String(result));
    }
}


