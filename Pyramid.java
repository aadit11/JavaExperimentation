import java.io.*;
public class Pyramid
{
    public static void main(String[] args) throws IOException
    {
        int opt = 0;
        int n = 0;
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for triangle");
        System.out.println("Enter 2 for inverted triangle");
        opt = Integer.parseInt(stdin.readLine());
        System.out.println("Enter the triangle terms -> ");
        n = Integer.parseInt(stdin.readLine());
        
        switch(opt)
        {
            case 1:
            for(int i = 1; i<=n; i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print(i);
                }
                    System.out.println();
                
            }
            break;
            
            case 2:
            for(int i = n; i>=1; i--)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print(i);
                }
                    System.out.println();
                
            }
            break;
        }
    }
}
