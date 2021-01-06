/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

public class methods9_2 {
    int a=100;
    int m1(int a)
    {
        return this.a;
    }
    public static void main(String[] args) {
        methods9_2 m = new methods9_2();
        int out=m.m1(10);
        System.out.println("This is the value of a or m1 but we print through out:"+out);
    }

    private int m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
