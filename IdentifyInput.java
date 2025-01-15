import java.io.*;
public class IdentifyInput
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your value");
        
        String stringInput = stdin.readLine();
        
        char inputChar = stringInput.charAt(0);
        
        if  (inputChar >= '0' && inputChar <= '9')
        {
            System.out.println("The character is a digit :" + inputChar);
        }
        
        else if ((inputChar >= 'a' && inputChar <= 'z') ||  (inputChar >= 'A' && inputChar <= 'Z'))
        {
              System.out.println("The character is a alphabet :" + inputChar);
        }
        
        else
        {
             System.out.println("The character is neither a alphabet nor a digit");
        }
        
    }
}
