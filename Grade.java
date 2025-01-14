import java.io.*;
public class Grade
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total marks : ");
        
        int mark = Integer.parseInt(stdin.readLine());
        
        float per = mark/5;
        
        System.out.println("My total percentage is :" + per );
        
        if(per >= 80.0)
        {
            System.out.println("Grade A ");
        }
    }
}
        
        
        
        
        
        