package JavaExperimentation;
import java.io.*;
public class Bitwise
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int  num1 , num2 , max;
        
        System.out.println("Enter a number for num1 :");
        num1 = Integer.parseInt(stdin.readLine());
        
        System.out.println("Enter a number for num2 :");
        num2 = Integer.parseInt(stdin.readLine());
        
        if(num1 == num2)
        { 
            System.out.println("The numbers are equal");
        }
        
        else if(num1 > num2)
        {
              System.out.println("The first number is greater than the second");
            }
            else if(num2 > num1)
            {
                 System.out.println("The second number is greater than the first");
            }
            
        }
    }
                
            
        
        
