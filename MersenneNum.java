public class MersenneNum
{
    public static void main(String [] args)
    {
        int flag = 0;
        int n = 0;
        long num = 0;
        
        for(int i = 1; i<num; i++)
        {
            num = (long)(Math.pow(2,i)-1);
            if(num==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("The number " +n+ "is a mersenne number");
        }
        else
        {
            System.out.println("The number " +n+ "is a mersenne number");
        }
    }
}
