import java.io.*;
public class Menu
{
    public static void main(String[] args) throws IOException
    {
          BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Enter length and breadth");
          
          int length = 0; 
          int breadth = 0;
          int choice = 0;
          int perimeter = 0;
          int area = 0;
          
          length = Integer.parseInt(stdin.readLine());
          breadth = Integer.parseInt(stdin.readLine());
         
          
          System.out.println("Enter your choice");
          System.out.println("Enter 1 for perimeter");
          System.out.println("Enter 2 for area");
          
          choice = Integer.parseInt(stdin.readLine());
          
          switch(choice)
          {
              case 1:
                perimeter = 2 * (length + breadth);
                System.out.println("The perimeter is :" + perimeter);
                break;
                
              case 2:
                area =  length * breadth;
                System.out.println("The area is :" + area);
                break;
                
              default:
                     System.out.println("Wrong value entered");
                     
                    }
                    
                }
            }
                
              
              
          
          
          
          
          
