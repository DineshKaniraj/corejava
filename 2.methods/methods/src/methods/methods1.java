
package methods;

class X{}
class Emp{}
class Y{}
class Student{}

public class methods1 
{
    void m3(X x, Emp e)
    {
        System.out.println("m3 method");
        
    }
    
    static void m4(Y y, Student s)
    {
        System.out.println("m4 method");
    }
 public static void main(String[] args)
 {
     methods1 m= new methods1();
     X x = new X();
     Y y = new Y();
     Emp emp = new Emp();
     Student student = new Student();
     
    
 }
}
