package JavaExperimentation;
import java.io.*; 
public class Cube
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int number;
        
        System.out.println("Please enter your number : ");
        number = Integer.parseInt(stdin.readLine());
          
        if(number == 0)
        {
              System.out.println("The value of the number is 0");
            }
              
            else
            {
        
                  System.out.println("The value of the number is : " + number);
                  
                   int cube = number * number * number;
                
                System.out.println("The cube of your number is : " + cube);
                  
           }
    } 
}
