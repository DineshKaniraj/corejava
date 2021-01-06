package variables;

public class Variables2   //try to understand the example
{
    int a = 199;  // instance variable cannot change without our user knowledge.
    static int b = 299;  // static variable if we change once the previous data will deleted.
 
    public static void main(String[] args)
    {
        Variables2 var = new Variables2();
        System.out.println(var.a);
        System.out.println(var.b);
        var.a=9999;
        var.b=8888;
        System.out.println(var.a);
        System.out.println(var.b);
        
        Variables2 var1 = new Variables2();
        System.out.println(var1.a);
        System.out.println(var1.b);
        
    }
}
