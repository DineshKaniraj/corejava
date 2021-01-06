
package variables;
public class Variables1 
{
    static int a= 1000;
    static int b= 2000;
 
    public static void main(String[] args)
    {
        System.out.println(Variables1.a); //static variables can access in the method by class name or object creation or directly accessing. 
        System.out.println(Variables1.b);
        Variables1 var = new Variables1();
        System.out.println(var.a);
        System.out.println(var.b);
        
        System.out.println(a);
        System.out.println(b);
        
        var.m1();
        
        
    }
    void m1()
    {
        System.out.println(Variables1.a);
        System.out.println(Variables1.b);
        Variables1 var = new Variables1();
        System.out.println(var.a);
        System.out.println(var.b);
        System.out.println(a);
        System.out.println(b);
        
    }
}

