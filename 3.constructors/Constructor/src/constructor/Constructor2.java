package constructor;
public class Constructor2 
{
    Constructor2(int a)
    {
        System.out.println("This is parameterized constructor");
    }
    void m1()
    {
        System.out.println("This is the method");
    }
    public static void main(String[] args)
    {
       // Constructor2 c = new Constructor2(); //If we didnot create any constructor then default constructor created by system itself 
                                                //but if u create any one of the constructor then system cannot produce a default constructor.
       //c.m1();
    }
}
