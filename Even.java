package JavaExperimentation;
import java.io.*;
public class Even
{
    public static void main(String[] args) throws IOException
    {
          BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Please enter a number");
          
          int number = Integer.parseInt(stdin.readLine());
          
          if (number % 2 == 0)
          {
              System.out.println("The number is even");
            }  
              else
            {
                
                   System.out.println("The number is odd");
                   
                }
                
            }
            
        }
