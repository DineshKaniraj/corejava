package constructor;
public class Constructor1 
{
    Constructor1()              //default constructor
    {
        System.out.println("This is default constructor");   
    }
    Constructor1(int a)         //parameterized constructor
    {
        System.out.println("This is parameterized constructor:"+a);  
    }
    void test()
    {
        System.out.println("This is normal method:");
    }
    public static void main(String[] args)
    {
        Constructor1 cc = new Constructor1();
        cc.test();
        Constructor1 cc1 = new Constructor1();
        cc1.test();
        Constructor1 cc2 = new Constructor1(10);
        cc2.test();
    }
}
