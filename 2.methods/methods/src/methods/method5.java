package methods;
public class method5 
{
    void m1()                                   //Instance method 
    {
        m2();                                  //Instance m2 method calling - instance method and instance area then direct call
        System.out.println("method 1");
    }
    void m2()
    {
        System.out.println("method 2");
        method5.m3(10);                         //static method m3 calling by classname
    }
    static void m3(int a)                       //static method m3
    {
        System.out.println("method 3");
    }
    public static void main (String[] args)
    {
        method5 m = new method5();
        m.m1();
    }
}
