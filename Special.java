
import java.io.*;
public class Special
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("Enter your number");
        num = Integer.parseInt(stdin.readLine());
        
        Special sp = new Special();
        sp.calculate(num);
    }
    
    public void calculate(int n1)
    {
        int rem = 0;
        int fact = 1;
        int sum = 0;
        
        while(n1 > 0)
        {
            rem = n1%10;
            n1 = n1/10;
            fact = 1;
            for(int i = 1; i<=rem; i++)
            {
                fact = fact * i;
                sum = sum + fact;
            }
        }
        
        if(n1 == sum)
        {
            System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
    }
}
        
