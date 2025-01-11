package JavaExperimentation;
import java.io.*;
public class Buffer
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your English marks : ");
        String englishMarks = stdin.readLine();
        
        System.out.println("Enter your Physics marks : ");
        String physicsMarks = stdin.readLine();
        
        System.out.println("Enter your Chemistry marks : ");
        String chemistryMarks =  stdin.readLine();
     
        System.out.println("Enter your Maths marks : ");
        String mathsMarks = stdin.readLine();
        
        System.out.println("Enter your Computer marks : ");
        String computerMarks = stdin.readLine();
        
        double engMarks = Double.parseDouble(englishMarks);
        double phyMarks = Double.parseDouble(physicsMarks);
        double chemMarks = Double.parseDouble(chemistryMarks); 
        double mathMarks = Double.parseDouble(mathsMarks);
        double compMarks = Double.parseDouble(mathsMarks);                                                    
        
        double totalMarks = engMarks + phyMarks + chemMarks + mathMarks + compMarks;
        double percent = totalMarks/5;
        System.out.println("The total of the marks is : " + totalMarks);
        System.out.println("The percentage is : " + percent);
        
      
    }
}    
        
        
   
