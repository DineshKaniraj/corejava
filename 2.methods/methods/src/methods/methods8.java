
package methods;

public class methods8 {
    int a=100;
    int m1(int a)                           //priority for local variable if local and instance are same variable
    {
        System.out.println("m1 method");
        return a;           //returning variable
    }
     int m2()                           //priority for instance variable if only instance  variable
    {
        System.out.println("m2 method");
        return a;           //returning variable
    }
     
      int m3(int a)                           //priority for instance variable if only instance  variable
    {
        System.out.println("m3 method");
        return this.a;           //returning variable
    }

    public static void main(String[] args) {
        methods8 m=new methods8();
        int z = m.m1(10);
        System.out.println("method return value :"+z);
        int y =m.m2();
        System.out.println("method return value :"+y);
        int x =m.m3(10);
        System.out.println("method return value:"+x);
    }
    
}
