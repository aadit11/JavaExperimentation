import java.io.*;
public class FindMinutes
{
    public static void main(String[] args) throws IOException
    {  
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your year : ");
        
        String inputYear = stdin.readLine();
        int year = Integer.parseInt(inputYear);
        
        System.out.println("Is this a leap year : ");
        String inputLeap = stdin.readLine();
        boolean leapYear =  Boolean.valueOf(inputLeap).booleanValue();
        
        int leap = 366 * 1440;
        int notLeap = 365 * 1440;
        
        if(leapYear)
        {
            System.out.println("The number of minutes is : " + leap);
        }
        else
        {
            System.out.println("The number of minutes is : " + notLeap);
        }
        
        
    }
}    
        
        
        
        
        
        
        
