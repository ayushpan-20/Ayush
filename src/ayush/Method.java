package ayush;
import java.util.Scanner;
public class Method 
{
    static int x=33;
    static int y=22;
    Scanner ay = new Scanner(System.in);
    public void sum()
    {
        System.out.println("Enter any two integers :");
        int a=ay.nextInt();
        int b=ay.nextInt();
        int c= a+b;
        System.out.println("sum of two numbers"+" "+c);
        
    }
    static void sub()
    {
         System.out.println("Enter any two integers :");
         int z=x-y;
         System.out.println("Subtraction of two numbers"+" "+z);
    }
    public static void main(String args[])
    {
        Method o=new Method();
        sub();
        o.sum();
    }
}