package JavaExperimentation;
import java.io.*;
public class Change
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader  stdin = new BufferedReader( new InputStreamReader(System.in));
        int number,d1,d2,d3;
        
        System.out.println("The 3 digit number is : ");
        number = Integer.parseInt(stdin.readLine());
        
        
        
         System.out.println("The first digit of your number is :");
         d1 = Integer.parseInt(stdin.readLine());
         
         
         System.out.println("The second digit of your number is :");
         d2= Integer.parseInt(stdin.readLine());
         
         
         System.out.println("The third digit of your number is:");
         d3 = Integer.parseInt(stdin.readLine());
         
         int sum = d1 + d2 + d3;
         
         System.out.println("The sum of the digits is:" + sum);
        }
    }
   