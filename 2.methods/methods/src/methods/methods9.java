package methods;
public class methods9 {
    int a=100;
    int m1(int a)
    {
        return a;
    }
    public static void main(String[] args) {
        methods9 m = new methods9();
        int out=m.m1(10);
        System.out.println("This is the value of a or m1(local variable) but we print through out:"+out);
    }

    int x() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
