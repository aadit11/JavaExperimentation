import java.io.*;
public class Series1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value for x");
        
        int x,i= 0,ctr;
        float sum = 0,f,p = 1;
        int k = 3;
        
        x = Integer.parseInt(stdin.readLine());
        
        while(i<= 5)
        {
            for(ctr = 1;ctr<=k;ctr++)
            {
                p=p * x;
                f=1;
                for(int j = 1;j<=k;j++)
                {
                    f=f * j;
                    sum = sum + p/f;
                    k=k+2;
                    i=i+1;
                }
            }
        }
         System.out.println("The sum is " + sum);
        }
    }