package ayush;
import java.util.Scanner;
class First
{ Scanner sc=new Scanner(System.in);
    void input()
    {   int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
    }
}
class Second extends First
{  
    int fact=1;
    int n,i;
    void cal()
    {
        for( i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of number is" + " " + fact);
    }
}
public class SingleInherit
{
public static void main(String args[])
{
    Second ob=new Second();
    ob.input();
    ob.cal();
}
}
