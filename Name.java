package JavaExperimentation;
import java.io.*;
public class Name
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name = stdin.readLine();
        int ctr = 1;
        
        System.out.println("Printing the number 10 times as per program");
        while(ctr <= 10 )
        {
            System.out.println(name);
            ctr++;
            
        }
    }
}