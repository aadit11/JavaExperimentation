package JavaExperimentation;
import java.io.*;
public class ArmstrongNum
{
    public static void main(String[] args) throws IOException
    {
        int inputNumber = 0;
        int i = 0;
        int k = 0;
        int s = 0;
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your limit");
        inputNumber = Integer.parseInt(stdin.readLine());
                
        for(i=1; i <= inputNumber; i++)
        {
            s = 0;
            k = i;
            int remainder = 0;  
            
            while(k != 0)
            {
                remainder = k % 10;
                s = s + remainder * remainder * remainder;
                k = k/10;
            }
            
            if(i==s)
            {
                System.out.println(i + " is an Armstrong number");
            }
            
            else
            {
                System.out.println(i + " is not an Armstrong number");
            }
        }
    }
}       
                