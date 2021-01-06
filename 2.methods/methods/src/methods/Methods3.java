package methods;
public class Methods3 
{
    void m1()
    {System.out.println("method1");}
    static void m2()
    {System.out.println("method2");}
    public static void main(String[] args)
    {
        Methods3 m = new Methods3();
        m.m1();
        Methods3.m2();
    }

    void m1(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
