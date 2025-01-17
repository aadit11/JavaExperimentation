package JavaExperimentation;
import java.io.*;
public class Num2
{
    public static void main(String[] args) throws IOException
    {
          BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
          
          int n;
          
          System.out.println("Enter a number :");
          
          n = Integer.parseInt(stdin.readLine());
          
          if(n%2==00)
          {
            System.out.println("The number is even");
        }
          
        else
        {
               System.out.println("The number is odd");
        }
        
    }
   }
            
          
