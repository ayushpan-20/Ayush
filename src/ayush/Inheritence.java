

package ayush;
class Sclass
{
    void SS()
    {
        System.out.println("This is a super class");
    }
}
class Cclass extends Sclass
{
    void CC()
    {
       System.out.println("This is a child class"); 
    }
}
public class Inheritence
{
 public static void main(String args[])
 {
     Cclass obj=new Cclass();
     obj.SS();
     obj.CC();
     
 }
}
