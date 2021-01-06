//default parameter
package constructor;
public class Constructor {
    Constructor()       //default constructor
    {
                    //empty implementation statement
    }
    void m1()
    {
        System.out.println("This is method:");
    }
    public static void main(String[] args) 
    {
        Constructor c = new Constructor();
        c.m1();
    }
    
}
