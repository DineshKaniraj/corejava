package methods;
public class method6 
{
    int x=100;              //instance variable
    int y=200;
    void add(int a, int b)   //instance method with local variable
    {
        System.out.println(x+y);
        System.out.println(a+b);
        
    }
    public static void main (String [] args)
    {
        method6 m = new method6();
        m.add(10,30);
    }
}
