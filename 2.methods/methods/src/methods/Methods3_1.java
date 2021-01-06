package methods;
public class Methods3_1 
{
    void m1()
    {
        System.out.println("1000");
    }
    void m1(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        Methods3_1 m = new Methods3_1();
        
        m.m1(100,200);
        m.m1();
        
        
        
    }
}
