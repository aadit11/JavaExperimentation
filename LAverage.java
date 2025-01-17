package JavaExperimentation;
import java.io.*;
public class LAverage
{
   public static void main(String[] args)  throws IOException
   
   {
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
       
       int inputnum;
       int sum;
       int count;
       double average;
       
       sum=0;
       count=0;
       
       inputnum = Integer.parseInt(stdin.readLine());
       
       while(inputnum != 0)
       {
           sum += inputnum;
           count++;
           System.out.println("Enter your next integer or type 0 to end");
           inputnum = Integer.parseInt(stdin.readLine());
           if(count == 0)
           {
               System.out.println("Wrong value entered");
                               
           }
           else
           {
               average = ((double)sum)/count;
               System.out.println();
               System.out.println("The average of the numbers is " + average);
            }
        }
    }
}
           
           