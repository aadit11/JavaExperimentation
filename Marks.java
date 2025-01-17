import java.io.*;
public class Marks
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter total marks");
        
        double marks;
        marks = Double.parseDouble(stdin.readLine());
        
        if(marks > 80)
        {
            System.out.println("Distinction");
        }
        else if((marks < 80) && (marks > 60))
        {
            System.out.println("First division");
        }
        else if((marks < 60) && (marks > 45))
        {
            System.out.println("Second division");
        }
        else if((marks < 45) && (marks > 40))
        {
            System.out.println("Pass");
        } 
        else
        {
            System.out.println("Fail");
        }
    }
}
        
        
        
        
        
