
package methods;

public class methods7_3 {
    methods7_3 m1()
    {
        System.out.println("This is same class - type - m1 method");
        methods7_3 mm = new methods7_3();
        return mm;
    }
methods7_3 m2()
{
    System.out.println("This is same class - type-m2 method . By this keyword we can return directly");
    return this;              //this is recommended for current class type method.
}
    public static void main(String[] args) {
       methods7_3 out = new methods7_3();
       methods7_3 s1=out.m1();
       methods7_3 s2=out.m2();
    }
    
}
