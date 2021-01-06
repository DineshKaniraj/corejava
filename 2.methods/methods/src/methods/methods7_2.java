
package methods;
class Employee {    }
class Cricketplayers {  }
class bank
{
    void banker(){System.out.println("This is bank class");}
}

public class methods7_2 
{
    Employee m1()                       //this is class-type method then we have to create an object for the employee class
                                                        //and by the object name we must be return.
    {  
        System.out.println("This m1 is class - Type method");
        Employee ee = new Employee();
        return ee;
    }
    Cricketplayers m2()
    {
        System.out.println("This m2 method is class-type method");
        Cricketplayers cp = new Cricketplayers();
        return cp;
    }
    
    void m3()
    {
        bank b = new bank();
        b.banker();
    }
    public static void main(String[] args)
    {
            methods7_2 m = new methods7_2();
            Employee e=m.m1();
            System.out.println(e);
            Cricketplayers cc=m.m2();
            System.out.println(cc);
            m.m3();
    }

}

