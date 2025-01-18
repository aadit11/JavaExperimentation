import java.io.*;

public class Num9
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a number");
        
        int Inputnum;
        
        Inputnum = Integer.parseInt(stdin.readLine());
        
        if(Inputnum==0)
        {
            System.out.println("The number has no value");
        }
        
        else if(Inputnum < 0)
        {
            System.out.println("The number is negative");
        }
        
        else if(Inputnum > 0)
        {
            System.out.println("The number is positive");
        }
        
    }
}    
