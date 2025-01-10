 import java.io.*;
public class Armstrong
{
    
    public static void main(String[] args) throws IOException
    {
       
       int inputNumber = 0;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value");
        inputNumber = Integer.parseInt(stdin.readLine());
        Armstrong arm = new Armstrong();
        arm.number(inputNumber);
        
    }       
    
    
    public void number(int inputNum)
    {
        int rem = 0;
        int sum = 0;                                                                         
        
        
        
        while(inputNum != 0)
        {
            rem = inputNum%10;
            sum = sum + rem * rem * rem;
            inputNum = inputNum/10;
        
           
        }
        if(inputNum == sum)
            {
                System.out.println("It is a armstrong number");
            }
            else
            {
                System.out.println("It is not a armstrong number");
            }
    }
}
             
        
                    
        
        
                 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        