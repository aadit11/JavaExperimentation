package JavaExperimentation;
import java.io.*;

public class AdditionByFunction
{
    public void Sum_Num() throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n1,n2;
        int sum;
        n1 = Integer.parseInt(stdin.readLine());
        n2 = Integer.parseInt(stdin.readLine());
        
        sum = n1 + n2;
        
        System.out.println("The sum of the 2 entered numbers is " + sum);
        
    }
}
        
    