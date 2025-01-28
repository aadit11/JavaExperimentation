import java.io.*;
public class TwinPrimeNumber
{
    public static void maun(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number which you want to check");
        
        int num1,num2;
        num1 = Integer.parseInt(stdin.readLine());
        num2 = Integer.parseInt(stdin.readLine());
       
        
        if((num1 % 2 != 0) || (num2 % 2 != 0))
        {
            if((num1 - num2 == 2) || (num2 - num1 == 2))
            {
                System.out.println("These numbers are twin prime numbers");
            }
            else
            {
                System.out.println("These numbers are not twin prime numbers");
            }
        }
    }
}
                
