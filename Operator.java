import java.io.*;
public class Operator
{
    public static void main(String[] args) throws IOException
    {
                                
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        double number1 = 0;
        double number2 = 0;
        double value = 0;
        char arithmeticOperator;
        
        System.out.println("Enter the first number");
        number1 = Double.parseDouble(stdin.readLine());
        
        System.out.println("Enter the second number");
        number2 = Double.parseDouble(stdin.readLine());
        
        System.out.println("Enter your arithmetic operator");
        arithmeticOperator = (char)stdin.read();
        
        switch(arithmeticOperator)
        {
            case '+':
            {
                     value = number1 + number2;
                     System.out.println("The value is : " + value);
             break;
            }
            case '-':
            {
                     value = number1 - number2;
                     System.out.println("The value is : " + value);
             break;
            }
            case '*':
            {
                     value = number1 * number2;
                     System.out.println("The value is : " + value);
             break;
            }
            case '/':
            {
                     value = number1 / number2;
                     System.out.println("The value is : " + value);
             break;
            }   
            default:
            {
                    System.out.println("Inappropriate value entered");
            }
            
            
        }
    }
}    
                    
            
            
            
       
            
        
