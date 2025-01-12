public class Fibonacci
{
    public static void main(String[] args)
    {
        
        Fibonacci fibo = new Fibonacci();
        fibo.series();
        
        
        
    }
    
    public void series()
    {
        int f1 =0;
        int f2 = 1;
        int temp = 0;
        
        System.out.println("The fibonacci series is....");
        
        System.out.println(f1);
        System.out.println(f2);
        
        
        do
        {
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
            System.out.println(temp);
        } while(f2 < 10);
    }
}
    
    
        
        
