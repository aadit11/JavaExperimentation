import java.io.*;
public class Small
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your first number :  "); 
        String numA = stdin.readLine();
       
        System.out.println("and your second number : ");
        String numB = stdin.readLine();
        
        
        int no = Integer.parseInt(numA);
        int ne = Integer.parseInt(numB);
       
        if(no > ne)
        {   
           
           System.out.println("The smaller number is : " + ne);
        }
        else
        { 
           System.out.println("The smaller number is : " + no);
              
        }
        
    }
        
}
    

