import java.io.*;
public class Triplets
{
    public static void main(String[] args) throws IOException
    {
          BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
          
          double a,b,c; 
          
          System.out.println("Enter your 3 consecutive numbers");
          
          a = Double.parseDouble(stdin.readLine());
          b = Double.parseDouble(stdin.readLine());
          c = Double.parseDouble(stdin.readLine());
          
          if( (a * a) + (b * b) == ( c * c))
          {
              System.out.println("The numbers are pythagorians triplets");
            }
          else
          {
               System.out.println("The numbers are not  pythagorians triplets");
            }
            
        }
        
    }