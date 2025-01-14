import java.io.*;
public class FPalindrome
{
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int num1;
        num1 = Integer.parseInt(stdin.readLine());
        
        int rem = 0;
        int reverseNumber = 0;
        
        int originalNumber = num1;
                
       while(num1!=0)
       {
            rem = num1%10;
            reverseNumber = (reverseNumber*10) + rem;
            num1 = num1/10;
       }
          if(originalNumber == reverseNumber)
       {
          if(reverseNumber % 2 != 0)
          {
              System.out.println("It is a prime palindrome number");
          }
          else
          {
            System.out.println("It is not a prime palindrome number");
          }
       }
    }
}
    