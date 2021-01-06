
package methods;
public class method6_1 
{
    int x=100;              //instance variable
    int y=200;
    void add(int x, int y)   //instance method with local variable
    {
        System.out.println(x+y);
        System.out.println(this.x+this.y);
        
    }
    public static void main (String [] args)
    {
        method6_1 m = new method6_1();
        m.add(10,30);
    }
}