//we will see  methods type, passing parameters and calling methods
package methods;
public class Methods {
    void m1(int a, char b)
    {
        System.out.println("first method or instance method");
        System.out.println(a);
        System.out.println(b);
    }
    
    static void m2(String c, double d)
    {
        System.out.println("second method or static method");
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args) 
    {
        Methods m = new Methods();
        m.m1(10,'K');
        Methods.m2("Dinesh",10.5);
                
       
    }
    
}
