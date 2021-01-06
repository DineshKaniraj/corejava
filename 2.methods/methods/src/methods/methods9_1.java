package methods;
public class methods9_1 
{
    int a=100;    //instance variable
    int x()
    {
        System.out.println("this is x method");
        return a;
    }
    public static void main(String[] args) {
        methods9_1 m = new methods9_1();
       int out = m.x();
        System.out.println("This is the value of a(instane variable) but we print through out:"+out);
    }
}
