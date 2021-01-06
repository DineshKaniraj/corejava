
package methods;

public class methods7_1 {
    int m1()
    {
        System.out.println("This is method of m1");
        return 10;
    }
    float m2()
    {
        System.out.println("this is method of m2");
        return 10.5f;
    }
    static char m3()
    {
        System.out.println("This is mthod of m3");
        return 'a';
    }

    public methods7_1() {
    }
    

    public static void main(String[] args) {
        methods7_1 mm = new methods7_1();
        int a=mm.m1();
        float b=mm.m2();
        char c=methods7_1.m3();
        System.out.println(a+b+c);
    }
    
}
