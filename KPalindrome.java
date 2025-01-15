package JavaExperimentation;
import java.io.*;

public class KPalindrome
{
public static void main(String[] args) throws IOException
    {
        System.out.println("Enter your number which you want to check");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int inputNum;
        inputNum = Integer.parseInt(stdin.readLine()); 
        
        KPalindrome pali = new KPalindrome();
        pali.check(inputNum); 
        
    }
    
    public void check(int num1)
    {
        int remainder = 0;
        
        int reverseNum = 0;
        
        
        while(num1 != 0)
        {
            remainder = num1%10;
            reverseNum = (reverseNum * 10)  + remainder;
            num1 = num1/10;
        }
        
        if(num1 == reverseNum)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }

}