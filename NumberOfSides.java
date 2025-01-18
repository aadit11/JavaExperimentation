import java.io.*;
public class NumberOfSides
{
    public static void main(String[] args) throws IOException
    {
        // Declare variables
         int sides = 0;
                
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        //Prompt user to input the number of sides
        // Store the value in the variable
         System.out.println("Please enter number of sides  ");
         sides = Integer.parseInt(stdin.readLine());
               
              
        // Print the type of shape based on the number of sides entered
        switch(sides)
        {
            case 3:
                 System.out.println("Triangle");
                 break;
            case 4:
                  System.out.println("Rectangle");
                  break;
            case 5:
                  System.out.println("Pentagon");
                  break;
            case 6:
                   System.out.println("Hexagon");
                   break;  
            default:
                    System.out.println("Inappropriate value entered");                 
        } 
    }
}