import java.io.*;
public class Weight
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the weight of the object");
        double weight;
        double cost;
        weight = Double.parseDouble(stdin.readLine());

        
        
        if(weight <= 10)
        {
            cost = weight * 20;
        }
        else if ((weight >= 10) && (weight <= 30))
        {
            cost = weight * 10;
        }    
        else if ((weight >= 30) && (weight <= 50))
        {
            cost = weight * 8;
        }    
        else
        {
            cost = weight * 5;
        }
        
        System.out.println("The weight is : " + weight);
         System.out.println("The cost is : " + cost);
        
    }
    
    
}