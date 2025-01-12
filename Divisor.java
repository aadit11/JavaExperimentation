package JavaExperimentation;
import java.io.*;
public class Divisor
{
   public static void main(String[] args)  throws IOException
   
   {
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
       
       int N;
       int divisorCount = 0;
       System.out.println("Enter a positive integer");
       N = Integer.parseInt(stdin.readLine());
       
       for(int testD = 1; testD <= N; testD++)
       {
           if(N%testD==0)
           {
              divisorCount++;
              
            }
        }
        System.out.println("The number of divisors is " + divisorCount);
    }
}