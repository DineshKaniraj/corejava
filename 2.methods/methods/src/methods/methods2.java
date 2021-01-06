
package methods;

class X1{}
class Y1{}
class Emp1{}
class Student1{}
public class methods2 
{
    void m1(X1 x,Emp1 e)
    {
        System.out.println("This is the method1");
    }
    static void m2(Y1 y,Student1 s)
    {
        System.out.println("This is the method2");
    }
    public static void main(String[] args)
    {
        methods2 m = new methods2();  //create object for main class
        X1 x = new X1();   //create object for X1 class
        Emp1 e = new Emp1();  // create object for Emp1 class
        m.m1(x,e);     // calling X1 and Emp1 object in the main class object  
         
        //(or)
        
        m.m1(new X1(), new Emp1());
        
        Y1 y = new Y1();
        Student1 s = new Student1();
        m.m2(y,s);
        
        //(or)
        
        m.m2(new Y1(),new Student1 () );
        
    }
    
}
