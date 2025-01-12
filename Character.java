package JavaExperimentation;
import java.io.*;
public class Character
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your name is : ");
        String name = stdin.readLine();
        
        System.out.println("The first letter of your surname is : ");
        char surname = (char)stdin.read();
        
        System.out.println("My name is : " + name + " " + surname);
        
    }
}    
        
   