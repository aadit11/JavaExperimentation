package JavaExperimentation;
import java.io.*;
public class CheckDayOfWeek
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your day number : ");
        
        int dayOfWeek = Integer.parseInt(stdin.readLine());
        
        switch(dayOfWeek)
        {
            case 0:
                 System.out.println("Sunday");
                 break;
            case 1:
                  System.out.println("Monday");
                  break;
            case 2:
                  System.out.println("Tuesday");
                  break;
            case 3:
                  System.out.println("Wednesday");
                  break;
            case 4:
                 System.out.println("Thursday");
                  break;
            case 5:
                  System.out.println("Friday");
                  break;
            case 6:
                   System.out.println("Saturday");
                  break;
                  
        
        }
           
    }
    
}        
            

        