package ayush;
import java.util.Scanner;
class Overloading
{
    void area(double l, double b)
    { 
        double ar=l*b;
        System.out.println("Enter the length and breadth of rectangle" + " " + ar);
     
    }
    void area(int h, int w)
    {
        double ar=0.5*(h*w);
        System.out.println("Enter the height and widdth of triangle" + " " + ar);
    }
    void area(int r)
    {
        double ar= (3.14 * r * r);
        System.out.println("Enter the radius of circle" + " " + ar);
            
    }
}
public class Methodoverloading 
{ 
      public static void main(String args[])
      {
          int w,h,r;
          double l,b;
          Scanner a= new Scanner(System.in);
          Overloading o = new Overloading();
          System.out.println("Enter length and breadth of rectangle");
          l=a.nextDouble();
          b=a.nextDouble();
          o.area(l,b);
          System.out.println("Enter height and width of triangle");
          h=a.nextInt();
          w=a.nextInt();
          o.area(h, w);
          System.out.println("Enter radius of circle");
          r=a.nextInt();
          o.area(r);
          
      }
            
    

}
