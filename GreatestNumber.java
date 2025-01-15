import java.io.*;
public class GreatestNumber
{
    public static void main(String[] args) throws IOException
    {
        // Declare Variables
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt the user to enter 3 numbers
        // Store value in respective variables
        System.out.println("Enter Number 1");
        number1 = Double.parseDouble(stdin.readLine());
              
        System.out.println("Enter Number 2");        
        number2 = Double.parseDouble(stdin.readLine());
        
        System.out.println("Enter Number 3");
        number3 = Double.parseDouble(stdin.readLine());
      
        // Check which number is greatest
        if((number1 > number2) && (number1 > number3))
        {
            System.out.println("The greatest of the 3 numbers is : " + number1);
        }
        else if((number2 > number1) && (number2 > number3))
        {
            System.out.println("The greatest of the 3 numbers is : " + number2);
        } 
        else if((number3 > number1) && (number3 > number2))
        {
             System.out.println("The greatest of the 3 numbers is : " + number3);
        }
        else if((number3 ==  number1) && (number1 ==  number2))
        {
             System.out.println("The 3 numbers are equal");
        }
    }
}
