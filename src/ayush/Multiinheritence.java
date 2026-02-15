package ayush;
import java.util.Scanner;
class Inputclass
{ Scanner sc=new Scanner(System.in);
  int h,b;
    void input()
    {   
        System.out.println("Enter height and base of triangle");
        h=sc.nextInt();
        b=sc.nextInt();
    }
}
class Calulation extends Inputclass
{
     double area;
    void cal()
    {
        area =(0.5 * h * b);
    }
}
class Display extends Calulation
{
    void show()
    {
        System.out.println("The area of triangle is " + " " + area);
    }
}
public class Multiinheritence 
{ 
public static void main(String args[])
{
    Display obj=new Display();
    obj.input();
    obj.cal();
    obj.show();
}
}
