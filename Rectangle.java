import java.io.*;
public class Rectangle
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the length and breadth");
        
        int choice;
        double l,b,p,a;
        l = Double.parseDouble(stdin.readLine());
        b = Double.parseDouble(stdin.readLine());
        
        System.out.println("Enter choice1 or choice2");
        System.out.println("Enter choice1 for perimeter");
        System.out.println("Enter choice2 for area");
        
        choice = Integer.parseInt(stdin.readLine());
        
        
        switch(choice)
        {
            case 1:
                   p = 2 * (l + b);
                   System.out.println("The perimeter is " + p);
            break;
            
            case 2:
                   a = l * b;
                   System.out.println("The area is " + a);
            break;
            
        }
    }
}
        
                   