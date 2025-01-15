package JavaExperimentation;
import java.io.*;
public class Incriment
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int x,z,a,b = 0;
        System.out.println(" Enter any number ");
        String y = stdin.readLine();
        x = Integer.parseInt(y);
          
        System.out.println("The number you entered is " + x);
        
       x+=(x++) + (++x) + x; 
        System.out.println("The value of x after " + x);
       
        
        //z = x++;
        //System.out.println("The number after x++ " + x);  
        //System.out.println("Value of z after x++ " + z);  
        
       // a = ++x;
        //System.out.println("The number after ++x " + x);
        //System.out.println("Value of a ++x " + x);
        
    }
}
