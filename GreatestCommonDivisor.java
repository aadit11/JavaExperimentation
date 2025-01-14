public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        int remainder;
        int num1 = 12;
        int num2 = 30;
        
        remainder = num1%num2;
        
        
        
        while(remainder != 0)
        {
           
            num1 = num2;
            num2 = remainder;
            remainder = num1%num2;
            
            
        }
        System.out.println("Value of greatest common divisor is : " + num2);
    }
}
