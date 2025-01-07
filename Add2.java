package JavaExperimentation;
import java.io.*;
public class Add2
{
     
    int sum;
    public static void main(String[] args) throws IOException
    {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your 2 numbers");
      int n1 = Integer.parseInt(stdin.readLine());
      int n2 = Integer.parseInt(stdin.readLine());
      
      // Create an instance of Add2
      Add2 add2 = new Add2();
      add2.calculateSum(n1, n2);
      
    }
    
    public void calculateSum(int x,int y)
    {
        sum = x + y;
        System.out.println("The sum of the 2 entered numbers is " + sum);
    }
}
