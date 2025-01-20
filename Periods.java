import java.util.Scanner;
public class Periods
{
    private int m, n, o = 0;
    
    private String scan = null;
    
    private static String periodName = null;
    
    private static boolean isEqual = true;
    
    final int WEDNESDAY  = 4;
    
    public static String noChange = "NoChange";
    
    public Periods()
    {
        
    }
    
    public Periods(String str)
    {
       periodName = str; 
    }
            
    public void setValue(String str)
    {
       int m = 1; 
        
       m = m+1;
       
       System.out.println("m : " + m);
       
       isEqual = false;
       
       System.out.println("isEqual : " + isEqual);
       
       System.out.println("Period : " + str);
    }
    
    public void setValueAgain()
    {
        m = m+1;
                 
        System.out.println("m : " + m);
    }
        
    
    
     
    public static void main(String[] args)
    {
     
     int number = 1;
      
     String[] periods = new String[]{"English","Hindi","Maths","Chemistry","Physics","Biology","History","Geography","Games","Library","Speech and Drama"};
      
      System.out.println("Length of periods array is : " + periods.length);
      
      for(int index=0; index < periods.length; index++)
      {
          System.out.println("Period " + number + " : " + periods[index]);
          
          number = number + 1;
          number++;
          ++number;
          number += 1;

      }
      
      Periods marathi = new Periods();
      marathi.setValue("Marathi");
      
      
      Periods english = new Periods("English");
      System.out.println("Period again : " + periodName);           
      
    }
    
    
}
    
      
    
     