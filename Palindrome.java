package JavaExperimentation;
import java.io.*;
public class Palindrome
{
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int n;
        n = Integer.parseInt(stdin.readLine());
        
        int value = 0;
        int rem = 0;
        int num1 = 0;
        
        n=num1;
        while(num1!=0)
        {
            rem = num1%10;
            System.out.println(rem);
            num1=num1/10;
        }
        if(rem==n)
              
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
}
  
        
