package JavaExperimentation;
import java.io.*;
public class NestedIf
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      int f , s , t;
      
      System.out.println("Enter first number:");
      f = Integer.parseInt(stdin.readLine());
      System.out.println("Enter next number:");
      s =  Integer.parseInt(stdin.readLine());
      System.out.println("Enter next number:");
      t =  Integer.parseInt(stdin.readLine());
      if((f > s) && (f > t))
      {
         System.out.println("The Biggest number is:" + f); 
        }
        
        else if ((s > t) && (s > f))
        {
           System.out.println("The Biggest number is:" + s); 
           
        }
        
        else
        {
           System.out.println("The Biggest number is:" + s); 
           
        }

    }

}
            
            
            
            
            
            
            
            
            
            
            