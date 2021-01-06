package methods;
public class method6_2 
{
    int x=100;              //instance variable
    int y=200;
   public static void add(int x, int y)   //instance method with local variable
    {
        System.out.println(x+y);
        System.out.println(method6_2.x+method6_2.y); //this keyword not allowed in static method
        
    }
   public static void main (String [] args)
    {
        method6_2 m = new method6_2();
        m.add(10,30);
    }
}
