package constructor;
public class Constructor6 
{
    Constructor6()
    {
        this(10);       //this keyword represents the single parameterized constructor and it should be first in the statement
        //this(12,23); only one another constructor can call in constructor...multiple constructor cannot called in constructor
        System.out.println("default constructor");
                

    }
    Constructor6(int a)
    {
        this(12,56);
        System.out.println("Single parameterized constructor");
    }
    Constructor6(int a,int b)
    {
        System.out.println("Multiple parameterized constructor");
    }
    
    public static void main(String[] args) {
        Constructor6 cc = new Constructor6();
    }
}
