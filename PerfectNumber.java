public class PerfectNumber
{
    public static void main(String[] args)
    {
        int maxNumber = 28;
        int i = 1;
        int divisor = 1;
        int sum = 0;
        int remainder = 0;
        
        for(i=1; i<=maxNumber; i++)
        {
            System.out.println("Value of i is : " + i);
            sum = 0;
            for(divisor=1; divisor<=i/2; divisor++)
            {
                remainder = i % divisor;
                System.out.println("Value of divisor is " + divisor);
                System.out.println("Remainder is : " + remainder);
                
                if(remainder == 0)
                {
                   sum = sum + divisor;
                   System.out.println("Sum is : " + sum);
                }
                
            }
            
            System.out.println("Sum outside second loop is : " + sum);
            if(sum == i)
            {
                System.out.println(i + " is a Perfect Number");
            }
            
            System.out.println("--------------------------------------------------------------------------------");
            
                     
        }
        
    }
        
    
}

      
            
