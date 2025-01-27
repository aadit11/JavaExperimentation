import java.io.*;
public class SumOfDigits
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your number");
        int n  = 0;
        n = Integer.parseInt(stdin.readLine());
        
        int div = 0;
        int sum = 0;
        
        do
        {
            sum = sum + n % 10;
            n = n/10;
        } while(n!=0);
        System.out.println("The sum of the digits of the entered number is " + sum);
    }
}
