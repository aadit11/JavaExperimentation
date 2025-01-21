//Project folder: ..../source_x/Chapter 2/Bitwise
import java.io.*;
//Demonstrate bitwise operators in java
public class Practise{
    public static void main(String[] args) {
        //Bitwise operators using int data type
        System.out.println("Bitwise Operators Results");
        int x = 50;
        int y = 51;
        int result1 = (x&y);
        System.out.println("Result of x&y = : " + result1);
        int result2 = (x|y);
        System.out.println("Result of x|y = : " + result2);
        int result3 = (x^y);
        System.out.println("Result of x^Y = : " + result3);
        int result4 = ~x;
        System.out.println("Result of ~x = : + result4");
    }
}