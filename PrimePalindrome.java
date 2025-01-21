
/**
 * Write a program to display all the prime palindrome numbers from 10 to 1000
 * 
 * @author Aadit Kshirsagar
 * @version 1.0
 */

public class PrimePalindrome
{
    public static void main(String[] args)  
    {    
         System.out.println("Program to print prime palindrome numbers from 10 to 1000");
         //Initialise instance variables
         int i = 0;
         boolean p1;
         boolean p2;
         
         System.out.println("The prime palindrome numbers from 10 to 1000 are :");
         //Using for loop to check whether the number is prime and a palindrome
         for(i = 10;i <=1000;i++)
         {
             p1 = prime(i);
             p2 = palin(i);
             //Checking if both the conditions are true
             if((p1 == true ) && (p2 == true ))
             {
                  System.out.println(i);
             }
         }
    }
    //Method to check whether the number is primr
    public static boolean prime(int n)
    {
        int i = 0;
        int count = 0;
        //Using for loop to count the number of factors
        for(i = 1;i <= n;i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        //Checking if the number has two factors
        if(count == 2)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
    //Method to check whether the number is a palindrome number
    public static boolean palin(int n)
    {
        int reverse = 0;
        int d = 0;
        int temp = n;
        //using while loop
        while(n != 0)
        {
            d = n % 10;
            reverse = (reverse * 10) + d;
            n = n/10;
        }
        //Returning true if number is palindrome and false if it isn't
        if(reverse == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
        