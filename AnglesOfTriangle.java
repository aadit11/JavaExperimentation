package JavaExperimentation;
import java.io.*;
public class AnglesOfTriangle
{      
    public static void main(String[] args) throws IOException
    {
        // Declare variables
        int angle1 = 0;
        int angle2 = 0;
        int angle3 = 0;
        int sumOfAngles = 0;
                        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt user to input value of all the three angles
        // Store every value in the respective variable
        System.out.println("Enter value for Angle1");
        angle1 = Integer.parseInt(stdin.readLine());
        
        System.out.println("Enter value for Angle2");
        angle2 = Integer.parseInt(stdin.readLine());
        
        System.out.println("Enter value for Angle3");      
        angle3 = Integer.parseInt(stdin.readLine());
       
        // Calculate sum of all angles
        sumOfAngles = angle1 + angle2 + angle3;
        
        // Check the sum of all angles
        // If sum of angles is equal to 180 degrees, triangle is possible
        // Else no traingle is possible
        if(sumOfAngles ==  180)
        {
            // Triangle possible as sum of all angles is equal to 180 degrees
            System.out.println("Triangle is possible as sum of angles is equal to 180 degrees");
            
            // Check if the triangle is Acute, Right or Obtuse 
            // First check if the triangle is a Right Triangle
            // A triangle is a Right Triangle if any of the angle is equal to 90 degrees
            if( (angle1 == 90) || (angle2 == 90) || (angle3 == 90) )
            {
                System.out.println("Triangle is  a Right Angled Triangle");
            }
            // Check if the triangle is an Acute Triangle 
            // A triangle is Acute if all angles are less than 90 degrees
            else if((angle1 < 90) && (angle2 < 90) && (angle3 < 90))
            {
                System.out.println("Triangle is a Acute Angled triangle");
            }
            // Check if triangle is Obtuse Triangle
            // A triangle is Obtuse if any of the angles is greater than 90 degrees
            else if(  (angle1 > 90) || (angle2 > 90) || (angle3 > 90)  )
            {
                System.out.println("Triangle is a Obtuse Angled triangle");
            }    
        }
        else
        {
            // Triangle not possible as sum of all angles is either less than or greater than 180 degrees
            System.out.println("Triangle is not possible as sum of angles is less than or greater than 180 degrees");
        }
    }
}
